package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.Standing;
import com.tritech.f1backend.model.User;
import com.tritech.f1backend.utils.Mock;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StandingController {

    @GetMapping("/standing")
    List<Standing> getStanding() {
        System.out.println("this is standing" + Mock.standing());
        return null;
    }
}
