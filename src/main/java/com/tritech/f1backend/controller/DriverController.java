package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.Driver;
import com.tritech.f1backend.model.DriverDetails;
import com.tritech.f1backend.utils.Mock;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DriverController {

    @GetMapping("/drivers")
    List<Driver> getDrivers() {
        System.out.println("this is driver list");
        System.out.println(Mock.driver());
        return Mock.driver();
    }

    @GetMapping("/drivers/{id}")
    Driver getDriversId(@PathVariable("id") int id) {
        System.out.println("this is driver by id");
        return Mock.getDriverById(id);
    }
}
