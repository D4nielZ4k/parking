package com.parking.controler;

import com.parking.configure.service.ActionService;
import com.parking.model.ParkingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class MainController {

    private final ActionService service;
    @PostMapping
    public void ParkingCar(@RequestParam final String address, @RequestParam final String regNr){
        service.parking(address,regNr);
    }
}
