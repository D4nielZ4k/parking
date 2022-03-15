package com.parking.repository;

import com.parking.database.Action;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActionRepository extends CrudRepository<Action, Long> {

}
