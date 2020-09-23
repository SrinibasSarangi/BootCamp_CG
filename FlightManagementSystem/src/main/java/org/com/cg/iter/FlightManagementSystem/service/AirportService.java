package com.cg.iter.FlightManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.iter.FlightManagementSystem.dto.Airport;
import com.cg.iter.FlightManagementSystem.dto.Booking;

@Service
public interface AirportService {
	
	Airport addAirport(Airport airport);

	List<Airport> viewAllAirport();

	Airport viewAirport(String airpotCode);

}
