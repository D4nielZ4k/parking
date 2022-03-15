package com.parking.configure.service;

import com.parking.database.Car;
import com.parking.model.CarDto;
import com.parking.repository.CarRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {
  private final CarRepository repository;

   public void addCar(final CarDto carRequest) {
       final Car car = buildCar(carRequest);
       try {
           repository.save(car);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

  protected Car buildCar(final CarDto carRequest) {
      return Car.builder()
              .mark(carRequest.getMark())
              .model(carRequest.getModel())
              .regNr(carRequest.getRegNr())
              .width(carRequest.getWidth())
              .build();
  }
}
