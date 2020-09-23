package com.cg.iter.FlightManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.iter.FlightManagementSystem.dto.Booking;
import com.cg.iter.FlightManagementSystem.dto.Passenger;

@Service
public interface BookingService {

	Booking addBooking(Booking booking);

	List<Booking> viewBooking(Long userId);

	List<Booking> viewBooking();

	Booking modifyBooking(Booking booking);

	void deleteBooking(Long bookingid);
	
}
