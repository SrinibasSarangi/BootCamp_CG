package com.cg.iter.FlightManagementSystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.FlightManagementSystem.dto.Flight;
import com.cg.iter.FlightManagementSystem.dto.Schedule;
import com.cg.iter.FlightManagementSystem.dto.ScheduledFlight;

public interface ScheduleFlightRepository extends JpaRepository<ScheduledFlight, Integer>
{

	Optional<ScheduledFlight> findBySchedule(Schedule schedule);

    List<ScheduledFlight> findByFlight(Flight flight);
}
