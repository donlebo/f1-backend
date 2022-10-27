package com.tritech.f1backend.controller;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.tritech.f1backend.model.Driver;
import com.tritech.f1backend.model.DriverDetails;
import com.tritech.f1backend.model.external.ResponseF1DriverStandings;
import com.tritech.f1backend.utils.F1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/updateData")

public class UpdateDataController {

    @Autowired
    private F1Repository f1Repository;

    @GetMapping("/standing")
    String updateStanding() {

        String url = "http://ergast.com/api/f1/2022/16/driverStandings.json";

        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = null;
        try {
            response = Unirest.get(url).asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        assert response != null;
        ResponseF1DriverStandings standings = new Gson().fromJson(response.getBody(), ResponseF1DriverStandings.class);
        List<Driver> drivers = f1Repository.drivers();
        int updated = 0;
        for (Driver d: drivers) {
            for (ResponseF1DriverStandings.DriverStandings s: standings.getMRData().getStandingsTable().getStandingsLists()[0].getDriverStandings()) {
                if(s.getDriver() != null && d.getRaceCode() == s.getDriver().getPermanentNumber()) {
                    DriverDetails dt = f1Repository.getDriverById(d.getId());
                    dt.setPoints(s.getPoints());
                    dt.setWins(s.getWins());
                    dt.setFinalPosition(s.getPosition());
                    f1Repository.updateStanding(dt);
                    updated++;
                }
            }
        }
        return "Updated " + updated + " drivers.";
    }
}
