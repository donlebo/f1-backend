package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.DriverDetails;
import com.tritech.f1backend.model.RaceDetails;
import com.tritech.f1backend.model.User;
import com.tritech.f1backend.utils.F1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private F1Repository f1Repository;

    @PostMapping("/signup")
    String createUser(@RequestBody User user) {
        System.out.println("user created" + user.toString());
        f1Repository.signUpUser(user);
        return user.toString();
    }

    @GetMapping("/user")
    User getProfileById(@PathVariable("username") String username) {
        return f1Repository.getUserById(username);
    }

    @PostMapping("/login")
    ResponseEntity<String> validateUser(@RequestBody User user) {
        System.out.println("user " + user.getUsername() + " wants to log in");
        if(f1Repository.login(user.getUsername(), user.getPassword())){

            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
            String token = UUID.randomUUID() + ":" + System.currentTimeMillis();
            return ResponseEntity.ok().body(
                    "{" +
                            " \"token\"  :  \"" + token +"\"," +
                            " \"expireDate\"  :  \"" + timeStamp + "\" " +
                            "}");

        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Bad credentials");
        }
    }
}

