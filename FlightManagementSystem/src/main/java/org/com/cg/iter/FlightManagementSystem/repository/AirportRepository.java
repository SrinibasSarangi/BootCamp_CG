package com.cg.iter.FlightManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.FlightManagementSystem.dto.Airport;
import com.cg.iter.FlightManagementSystem.dto.Booking;

public interface AirportRepository extends JpaRepository<Airport, Integer>{

	Airport save(Airport airport);
	Optional<Airport> findByAirportCode(String airpotCode);

}
