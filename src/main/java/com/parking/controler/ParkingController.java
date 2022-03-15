package com.parking.controler;

import com.parking.configure.service.ParkingService;
import com.parking.model.ParkingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parking")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ParkingController {

   private final ParkingService parkingService;

    @PostMapping
    public void ParkingCar(@RequestBody final ParkingDto parking){
        parkingService.addParking(parking);
    }

}
