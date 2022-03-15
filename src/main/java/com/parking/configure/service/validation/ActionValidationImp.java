package com.parking.configure.service.validation;

import com.parking.database.Action;
import com.parking.database.Car;
import com.parking.database.Parking;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class ActionValidationImp {

    public boolean Check(final Action action) {
        if (action.getParking().getSlots() == 0 &&
                action.getParking().getChargers() == 0 &&
                action.getParking().getWidth() < action.getCar().getWidth() &&
                action.getParking().isLpgAllowed() == lpgAllowedCheck(action.getCar())
        ) {
            System.out.println("Sorry");
            return false;
        } else {
            return true;
        }
    }

    public boolean lpgAllowedCheck(final @NotNull Car car) {
        if (car.getDriveModel().equals("lpg")) {
            return true;
        } else {
            return false;
        }
    }
}
