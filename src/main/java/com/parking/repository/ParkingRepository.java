package com.parking.repository;

import com.parking.database.Parking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends CrudRepository<Parking, String> {
    Parking findByAddress(final String address);
}
