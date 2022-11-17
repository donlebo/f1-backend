package com.tritech.f1backend.utils;
import com.tritech.f1backend.model.*;

import java.util.ArrayList;
import java.util.List;

public class Mock {
    public static List<User> users() {
        //List<User> userList = new ArrayList<User>();
        //User Donato = new User(
        //        0,
        //        "donlebo",
        //        "Donato",
        //        "Bello",
        //        "donato.bello101@gmail.com",
        //        "12345",
        //        "3343819116",
        //        1);
        //User Mario = new User(
        //        1,
        //        "marioR",
        //        "Mario",
        //        "Rossi",
        //        "mario.rossi@gmail.com",
        //        "67890",
        //        "3333333333",
        //        0);
        //User Luca = new User(
        //        2,
        //        "lucaV",
        //        "Luca",
        //        "Verdi",
        //        "luca.verdi@gmail.com",
        //        "13579",
        //        "7777777777",
        //        1);
        //
        //userList.add(Donato);
        //userList.add(Mario);
        //userList.add(Luca);

        /*for (User user : userList) {
            System.out.println(user.toString());
        }*/

        return null;
    }

    //public static User getUsersByUsername(String userName){
      //  List<User> users = Mock.users();
        //for (User user : users) {
          //  if (user.getUserName().equals(userName)) {
            //    return user;
            //}
        //}
        //return null;
    //<dependency> <!-- driver db -->
      //      <groupId>com.oracle</groupId>
        //    <artifactId>ojdbc11</artifactId>
          //  <version>21.6.0.0.1</version>
            //<scope>system</scope>
    //<systemPath>${pom.basedir}/src/main/resources/ojdbc11.jar</systemPath>
      //  </dependency>
    //}

    /* public static List<Driver> driver(){
        List<Driver> driverList = new ArrayList<Driver>();
        Driver Leclerc = new Driver(
                0,
                "Charles",
                "Leclerc"
        );

        Driver Verstappen = new Driver(
                1,
                "Max",
                "Verstappen"
        );

        Driver Perez = new Driver(
                2,
                "Sergio",
                "Perez"
        );

        Driver Russell = new Driver(
                3,
                "George",
                "Russell"
        );

        Driver Sainz = new Driver(
                4,
                "Carlos",
                "Sainz"
        );

        Driver Hamilton = new Driver(
                5,
                "Lewis",
                "Hamilton"
        );

        Driver Norris = new Driver(
                6,
                "Lando",
                "Norris"
        );

        Driver Bottas = new Driver(
                7,
                "Valtteri",
                "Bottas"
        );

        Driver Ocon = new Driver(
                8,
                "Esteban",
                "Ocon"
        );

        Driver Magnussen = new Driver(
                9,
                "Kevin",
                "Magnussen"
        );

        Driver Ricciardo = new Driver(
                10,
                "Daniel",
                "Ricciardo"
        );

        Driver Tsunoda = new Driver(
                11,
                "Yuki",
                "Tsunoda"
        );

        Driver Alonso = new Driver(
                12,
                "Fernando",
                "Alonso"
        );

        Driver Gasly = new Driver(
                13,
                "Pierre",
                "Gasly"
        );

        Driver Vettel = new Driver(
                14,
                "Sebastian",
                "Vettel"
        );

        Driver Albon = new Driver(
                15,
                "Alexander",
                "Albon"
        );

        Driver Stroll = new Driver(
                16,
                "Lance",
                "Stroll"
        );

        Driver Guanyu = new Driver(
                17,
                "Zhou",
                "Guanyu"
        );

        Driver Schumacher = new Driver(
                18,
                "Mick",
                "Schumacher"
        );

        Driver Hulkenberg = new Driver(
                19,
                "Nico",
                "Hulkenberg"
        );

        Driver Latifi = new Driver(
                20,
                "Nicholas",
                "Latifi"
        );

        driverList.add(Leclerc);
        driverList.add(Verstappen);
        driverList.add(Perez);
        driverList.add(Russell);
        driverList.add(Sainz);
        driverList.add(Hamilton);
        driverList.add(Norris);
        driverList.add(Bottas);
        driverList.add(Ocon);
        driverList.add(Magnussen);
        driverList.add(Ricciardo);
        driverList.add(Tsunoda);
        driverList.add(Alonso);
        driverList.add(Gasly);
        driverList.add(Vettel);
        driverList.add(Albon);
        driverList.add(Stroll);
        driverList.add(Guanyu);
        driverList.add(Schumacher);
        driverList.add(Hulkenberg);
        driverList.add(Latifi);


        for (Driver driver : driverList) {
            System.out.println(driver.toString());
        }

        return driverList;
    }*/

    /*public static Driver getDriverById(int id){
        List<Driver> drivers = Mock.driver();
        for (Driver driver : drivers) {
            if (driver.getId() == id) {
                return driver;
            }
        }
        return null;
    }*/

    /*public static List<Race> races(){
        List<Race> raceList = new ArrayList<Race>();
        Race Monza = new Race(
                0,
                "Monza Grand Prix"
        );

        raceList.add(Monza);

        for (Race race : raceList) {
            System.out.println(race.toString());
        }

        return raceList;
    }

    public static Race getRaceById(int id){
        List<Race> races = Mock.races();
        for (Race race : races) {
            if (race.getId() == id) {
                return race;
            }
        }
        return null;
    }*/

    public static List<Standing> standings(){
        List<Standing> standingList = new ArrayList<Standing>();
        Standing First = new Standing(
                0,
                "Leclerc"
        );

        standingList.add(First);

        for (Standing standing : standingList) {
            System.out.println(standing.toString());
        }

        return standingList;
    }

    public static List<Standing> standing() {
        List<Standing> standingList = new ArrayList<Standing>();
        Standing First = new Standing(
                1,
                "Max"
        );

        Standing Second = new Standing(
                2,
                "Charles"
        );

        standingList.add(First);
        standingList.add(Second);

        for (Standing standing : standingList) {
            System.out.println(standing.toString());
        }

        return standingList;
        }
    }

