package com.tritech.f1backend.controller;
import com.tritech.f1backend.model.Constructor;
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
public class ConstructorController {
    @Autowired
    private F1Repository f1Repository;

    @GetMapping("/constructor")
    List<Constructor> getConstructor() {
        System.out.println(f1Repository.getConstructor());
        return f1Repository.getConstructor();
    }
}
