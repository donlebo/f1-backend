package com.tritech.f1backend.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class DriverDetails {
    private String driverName;
    private String name;
    private String surname;
    private String nationality;
    private String raceCode;
    private int finalPosition;
    private int wins;
    private int points;
    private String constructor;
    private String constructorNationality;
    private String learnMoreOnDriver;
    private String LearnMoreOnConstructor;
    private int id;
    private String birthday;
}
