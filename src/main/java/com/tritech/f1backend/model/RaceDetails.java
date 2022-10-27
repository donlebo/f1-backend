package com.tritech.f1backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class RaceDetails {
    private String raceName;
    private Date raceDate;
    private String raceCircuit;
    private String circuitCountry;
    private int raceLaps;
    private int fastestLaps;
    private float fastestLapsSpeed;
    private float averageLapsTime;
    private int round;
    private int season;
    private String status;
    private String learnMoreOnGranPrix;
    private String learnMoreOnCircuit;
}
