package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.Race;
import com.tritech.f1backend.model.RaceDetails;
import com.tritech.f1backend.utils.F1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.List;


@RestController
public class RaceController {

    @Autowired
    private F1Repository f1Repository;

    @GetMapping("/race")
    List<Race> getRace() {
        System.out.println(f1Repository.getRaces());
        return f1Repository.getRaces();
    }

    @GetMapping("/race/{round}")
    RaceDetails getDriversId(@PathVariable("round") int round) {
        return f1Repository.getRaceById(round);
    }

    @GetMapping("/race/{round}/img")
    @ResponseBody
    public ResponseEntity<?> getImageDynamicType(@PathVariable("round") int round) {
        String url = "/assets/circuit-" + round + ".png";
        InputStream in = getClass().getResourceAsStream(url);
        if (in != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_PNG)
                    .body(new InputStreamResource(in));
        } else {
            return (ResponseEntity<?>) ResponseEntity.notFound();
        }
    }
}
