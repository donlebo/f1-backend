package com.tritech.f1backend.utils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tritech.f1backend.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class F1Repository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void signUpUser(User user) {
            String query = "INSERT INTO USER (username, name, email, password, id) values ('"
                + user.getUsername()
                + "','"
                + user.getName()
                + "','"
                + user.getEmail()
                + "','"
                + user.getPassword()
                + "')";
        jdbcTemplate.execute(query);
    }

    public boolean login(String username, String password) {
        String query = "SELECT count(*) result FROM USER " +
                "where username = '" + username + "' and password = '" + password + "'";
        List<Integer> result = jdbcTemplate.query(query, (rs, rowNum) -> (
                 rs.getInt("result")
            )
        );
        return result.get(0) == 1;
    }

    public User getUserById(String username) {
        String query = "SELECT * FROM USER where username = " + username;
        jdbcTemplate.execute(query);
        return null;
    }

    public List<Driver> drivers() {
        String query = "select name, surname, id, racecode from DRIVER order by points desc";
        return
            jdbcTemplate.query(query, (rs, rowNum) -> new Driver(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("surname"),
                    rs.getInt("racecode")
                    )
            );
    }

    public DriverDetails getDriverById(int id) {
        String query = "select * from DRIVER where id = " + id;
        return jdbcTemplate.queryForObject(query, ((rs, rowNum) -> new DriverDetails(
                rs.getString("driverName"),
                rs.getString("name"),
                rs.getString("surname"),
                rs.getString("nationality"),
                rs.getString("raceCode"),
                rs.getInt("finalPosition"),
                rs.getInt("wins"),
                rs.getInt("points"),
                rs.getString("constructor"),
                rs.getString("constructorNationality"),
                rs.getString("learnMoreOnDriver"),
                rs.getString("learnMoreOnConstructor"),
                id,
                rs.getString("birthday")
        )));
    }

    public void updateStanding(DriverDetails driver) {
        String script = "update DRIVER set WINS = " + driver.getWins() +
                    ", POINTS = " + driver.getPoints() +
                    ", FINALPOSITION = " + driver.getFinalPosition() +
                    " where ID = " + driver.getId();
        jdbcTemplate.execute(script);
    }

    public List<Constructor> getConstructor() {
        String query = "SELECT DISTINCT CONSTRUCTOR, CONSTRUCTORNATIONALITY FROM DRIVER ORDER BY CONSTRUCTORNATIONALITY ASC";
        return
            jdbcTemplate.query(query, (rs, rowNum) -> new Constructor(
                        rs.getString("constructor"),
                        rs.getString("constructornationality")
            )
        );
    }

    public List<Race> getRaces() {
        String query = "SELECT RACENAME, ROUND from RACE";
        return
            jdbcTemplate.query(query, (rs, rowNum) -> new Race(
                    rs.getString("racename"),
                    rs.getInt("round")
                )
            );
    }

    public RaceDetails getRaceById(int round) {
        String query = "select * from RACE where round = " + round;
        return jdbcTemplate.queryForObject(query, ((rs, rowNum) -> new RaceDetails(
                rs.getString("racename"),
                rs.getDate("racedate"),
                rs.getString("racecircuit"),
                rs.getString("circuitcountry"),
                rs.getInt("racelaps"),
                rs.getInt("fastestlaps"),
                rs.getFloat("fastestlapsspeed"),
                rs.getFloat("averagelapstime"),
                rs.getInt("round"),
                rs.getInt("season"),
                rs.getString("status"),
                rs.getString("learnMoreGranPrix"),
                rs.getString("learnMoreOnCircuit")
        )));
    }
}
