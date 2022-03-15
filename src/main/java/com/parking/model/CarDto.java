package com.parking.model;

import lombok.Data;

@Data
public class CarDto {
    private String regNr;
    private String mark;
    private String model;
    private double width;
    private String driveModel;
}
