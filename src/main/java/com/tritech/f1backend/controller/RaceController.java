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

    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping("/race")
    List<Race> getRace() {
        System.out.println("this is a race table");
        return getRace();
    }

    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping("/race/{raceRound}")
    List<SingleRace> getSingleRace() {
        System.out.println("this is a single race");
        return getSingleRace();
    }
}
