package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @PostMapping("/user")
    User createUser(@RequestBody User createUser) {
        List<User> userList = new ArrayList<User>();
        User Donato = new User(0,
                "donlebo",
                "Donato",
                "Bello",
                "donato.bello101@gmail.com",
                "12345",
                "3343819116",
                1 );
        User Mario = new User(1,
                "marioR",
                "Mario",
                "Rossi",
                "mario.rossi@gmail.com",
                "67890",
                "3333333333",
                0 );
        User Luca = new User(2,
                "lucaV",
                "Luca",
                "Verdi",
                "luca.verdi@gmail.com",
                "13579",
                "7777777777",
                1 );

        userList.add(Donato);
        userList.add(Mario);
        userList.add(Luca);

        for (User user: userList) {
            System.out.println(user.toString());
        }
        System.out.println("user create");
        return (User) userList;
    }

    @PostMapping("/user/{username}/favorites/{driverName}")
    User addFavoriteDriver(@RequestBody User addFavoriteDriver) {
        System.out.println("new favorite driver was added to your list");
        return addFavoriteDriver;
    }

    @GetMapping("/user/{username}/favorites")
    List<User> getFavoriteDriver() {
        System.out.println("this is your favorite drivers");
        return getFavoriteDriver();
    }

    @GetMapping("/user/{username}")
    List<User> getUserByName() {
        System.out.println("this is user");
        return getUserByName();
    }

    /* @PutMapping("/user/{username}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        System.out.println("this user is changed");
        return
    } */

    @GetMapping("/user/login")
    List<User> loginUser() {
        System.out.println("in");
        return loginUser();
    }

    @GetMapping("/user/logout")
    List<User> logoutUser() {
        System.out.println("out");
        return logoutUser();
    }
}
