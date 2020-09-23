package com.cg.iter.FlightManagementSystem.service;

import java.util.Date; 
import java.util.List;

import com.cg.iter.FlightManagementSystem.dto.Airport;
import com.cg.iter.FlightManagementSystem.dto.Flight;
import com.cg.iter.FlightManagementSystem.dto.Schedule;
import com.cg.iter.FlightManagementSystem.dto.ScheduledFlight;

public interface ScheduledFlightService {

	ScheduledFlight saveScheduleFlight(ScheduledFlight scheduledFlight);

	List<ScheduledFlight> viewScheduledFlight();

	List<ScheduledFlight> viewScheduledFlights(Long flightno);

	void deleteScheduledFlight(Integer scheduleFlightId);

	ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule, Integer id);

	List<ScheduledFlight> viewScheduledFlights(Airport toAirport, Airport fromAirport, Date date);

}
