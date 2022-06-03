package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.Driver;
import com.tritech.f1backend.model.DriverDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DriverController {

    @GetMapping("/drivers")
    List<Driver> getDrivers() {
        System.out.println("this is driver list");
        return getDrivers();
    }

    @GetMapping("/drivers/{id}")
    List<DriverDetails> getDriversId() {
        System.out.println("this is driver by id");
        return getDriversId();
    }
}
