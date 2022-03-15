package com.parking.configure.service;

import com.parking.configure.service.validation.ActionValidationImp;
import com.parking.database.Action;
import com.parking.database.Car;
import com.parking.database.Parking;
import com.parking.repository.ActionRepository;
import com.parking.repository.CarRepository;
import com.parking.repository.ParkingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActionService {

    private final CarRepository carRepository;
    private final ParkingRepository parkingRepository;
    private final ActionRepository actionRepository;
    private final ActionValidationImp imp;

    public void parking(final String address, final String regNr) {
        final Action action = builderAction(address, regNr);

        try {
            if (imp.Check(action)) {
                actionRepository.save(action);
            } else {
                System.out.println("no co nic");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private Action builderAction(final String address, final String regNr) {
        Car car = carRepository.findByRegNr(regNr);
        Parking parking = parkingRepository.findByAddress(address);

        return Action.builder()
                .car(car)
                .parking(parking)
                .build();
    }
}
