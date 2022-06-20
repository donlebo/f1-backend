package com.tritech.f1backend.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Driver {
    private int id;
    private String driverName;
    private String driverSurname;

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", driverName='" + driverName + '\'' +
                ", driverSurname='" + driverSurname + '\'' +
                '}';
    }
}
