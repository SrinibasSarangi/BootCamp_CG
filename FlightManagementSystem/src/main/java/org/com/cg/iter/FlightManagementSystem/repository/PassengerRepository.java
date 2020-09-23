package com.cg.iter.FlightManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.FlightManagementSystem.dto.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}
