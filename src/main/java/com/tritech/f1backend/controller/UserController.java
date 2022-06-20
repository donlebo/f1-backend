package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.User;
import com.tritech.f1backend.utils.Mock;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @PostMapping("/user")
    String createUser(@RequestBody User createUser) {
        System.out.println("user create");
        return "User created" + createUser.toString();
    }

    @PostMapping("/user/{username}/favorites/{driverName}")
    User addFavoriteDriver(@RequestBody User addFavoriteDriver) {
        System.out.println("new favorite driver was added to your list");
        return null;
    }

    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping("/user/{username}/favorites")
    List<User> getFavoriteDriver() {
        System.out.println("this is your favorite drivers");
        return null;
    }

    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping("/user/{username}")
    User getUserByName(@PathVariable("username") String userName) {
        return Mock.getUsersByUsername(userName);
    }

    @PutMapping("/user/{username}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        System.out.println("this user is changed");
        return null;
    }

    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping("/user/login")
    List<User> loginUser() {
        System.out.println("in");
        return null;
    }

    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping("/user/logout")
    List<User> logoutUser() {
        System.out.println("out");
        return null;
    }
}
