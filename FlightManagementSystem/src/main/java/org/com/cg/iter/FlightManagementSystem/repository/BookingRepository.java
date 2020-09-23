package com.cg.iter.FlightManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.FlightManagementSystem.dto.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

	Booking save(Booking booking);

}
