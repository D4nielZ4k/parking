package com.parking.configure.service;


import com.parking.database.Parking;
import com.parking.model.ParkingDto;
import com.parking.repository.ParkingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParkingService {

   private final ParkingRepository repository;

    public void addParking(final ParkingDto parkingDto){
       final Parking parking = builder(parkingDto);
        try {
            repository.save(parking);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    protected Parking builder(final ParkingDto parkingRequest) {
        return Parking.builder()
                .address(parkingRequest.getAddress())
                .name(parkingRequest.getName())
                .slots(parkingRequest.getSlots())
                .chargers(parkingRequest.getChargers())
                .lpgAllowed(parkingRequest.isLpgAllowed())
                .width(parkingRequest.getWidth())
                .build();
    }
}
