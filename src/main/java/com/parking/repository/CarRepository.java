package com.parking.repository;

import com.parking.database.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends CrudRepository<Car,String> {
    Car findByRegNr(final String regNr);
}
