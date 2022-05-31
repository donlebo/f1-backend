package com.tritech.f1backend.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class DriverDetails {
    private int id;
    private String driverName;
    private String driverSurname;
    private Date dateOfBirth;
    private String nationality;
    private int raceNumber;
    private int raceCode;
    private  String url;
    private int point;
    private int win;
    private String constructor;
    private String driverUrl;
    private String constructorUrl;
}
