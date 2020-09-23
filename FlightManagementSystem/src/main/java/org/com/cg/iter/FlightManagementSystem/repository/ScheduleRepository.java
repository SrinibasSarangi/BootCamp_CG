package com.cg.iter.FlightManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.FlightManagementSystem.dto.Airport;
import com.cg.iter.FlightManagementSystem.dto.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{
	List<Schedule> findBySourceAirportAndDestinationAirport(Airport sourceAirport, Airport destinationAirport);


}
