package com.tritech.f1backend.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
    public class SingleRace {
        private String raceName;
        private int raceRound;
        private Date raceTimeTable;
        private String circuitName;
        private String circuitCountry;
        private int raceLaps;
        private int season;
        private int fastestLaps;
        private float fastestLapTime;
        private int topSpeed;
        private String urlGranPrix;
        private String urlCircuit;
    }
