package com.parking.controler;

import com.parking.configure.service.CarService;
import com.parking.model.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CarController {
    private final CarService carService;

    @PostMapping
    public void addCar(@RequestBody final CarDto request){
        carService.addCar(request);
    }


}
