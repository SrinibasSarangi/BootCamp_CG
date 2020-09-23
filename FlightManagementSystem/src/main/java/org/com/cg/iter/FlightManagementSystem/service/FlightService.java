package com.cg.iter.FlightManagementSystem.service;

import java.util.List;

import com.cg.iter.FlightManagementSystem.dto.Flight;

public interface FlightService 
{

	Flight addFlight(Flight flight);

	Flight viewFlightByFlightNo(Long flightno);

	List<Flight> viewFlight();

	Flight modifyFlight(Flight flight);

	void deleteFlight(Long flightno);
	

}
