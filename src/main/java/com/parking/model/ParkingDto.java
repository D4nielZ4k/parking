package com.parking.model;

import com.parking.database.Car;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ParkingDto {
    private String address;
    private String name;
    private int slots;
    private int chargers;
    private boolean lpgAllowed;
    private double width;
}
