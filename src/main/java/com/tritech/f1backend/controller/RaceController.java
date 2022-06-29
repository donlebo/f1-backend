package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.Driver;
import com.tritech.f1backend.model.Race;
import com.tritech.f1backend.model.SingleRace;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RaceController {

    @GetMapping("/race")
    List<Race> getRace() {
        System.out.println("this is a race table");
        return null;
    }

    @GetMapping("/race/{raceRound}")
    List<SingleRace> getSingleRace() {
        System.out.println("this is a single race");
        return null;
    }
}
