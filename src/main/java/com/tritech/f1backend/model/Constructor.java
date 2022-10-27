package com.tritech.f1backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Constructor {
    private String constructor;
    private String constructorNationality;

    @Override
    public String toString() {
        return "Constructor{" +
                "constructor='" + constructor + '\'' +
                ", constructornationality='" + constructorNationality + '\'' +
                '}';
    }
}
