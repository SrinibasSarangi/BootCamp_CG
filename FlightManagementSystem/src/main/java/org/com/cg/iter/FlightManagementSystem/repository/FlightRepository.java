package com.cg.iter.FlightManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.FlightManagementSystem.dto.Flight;
import com.cg.iter.FlightManagementSystem.dto.User;

public interface FlightRepository extends JpaRepository<Flight, Long>
{
	Flight save(Flight flight);

}
