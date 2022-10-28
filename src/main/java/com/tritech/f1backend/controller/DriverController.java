package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.Driver;
import com.tritech.f1backend.model.DriverDetails;
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
public class DriverController {

    @Autowired
    private F1Repository f1Repository;

    @GetMapping("/drivers")
    List<Driver> getDrivers() {
        System.out.println(f1Repository.drivers());
        return f1Repository.drivers();
    }

    @GetMapping("/drivers/{id}")
    DriverDetails getDriversId(@PathVariable("id") int id) {
        return f1Repository.getDriverById(id);
    }

    @GetMapping("/drivers/{id}/img")
    @ResponseBody
    public ResponseEntity<?> getImageDynamicType(@PathVariable("id") int id) {
        String url = "/assets/driver-" + id + ".png";
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
