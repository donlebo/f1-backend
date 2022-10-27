package com.tritech.f1backend.model.external;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ResponseF1DriverStandings {
    private MRData MRData;

    @Getter
    @Setter
    @AllArgsConstructor
    public class MRData {
        private String xmlns;
        private String series;
        private String url;
        private int limit;
        private int offset;
        private int total;
        private StandingsTable StandingsTable;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class StandingsTable {
        private int season;
        private int round;
        private StandingsLists[] StandingsLists;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class StandingsLists {
        private int season;
        private int round;
        private DriverStandings[] DriverStandings;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class DriverStandings {
        private int position;
        private String positionText;
        private int points;
        private int wins;
        private Driver Driver;
        private Constructors[] Constructors;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class Driver {
        private String driverId;
        private int permanentNumber;
        private String code;
        private String url;
        private String givenName;
        private String givenSurname;
        private String familyName;
        private Date dateOfBirth;
        private String nationality;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class Constructors {
        private String constructorId;
        private String url;
        private String name;
        private String nationality;
    }
}
