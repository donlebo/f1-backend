package com.tritech.f1backend.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Race {
    private String raceName;
    private int round;

    @Override
    public String toString() {
        return "Race{" +
                "raceName='" + raceName + '\'' +
                ", round=" + round +
                '}';
    }
}
