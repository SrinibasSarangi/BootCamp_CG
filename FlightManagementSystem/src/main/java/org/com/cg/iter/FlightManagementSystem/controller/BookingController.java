package com.cg.iter.FlightManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.FlightManagementSystem.dto.Booking;
import com.cg.iter.FlightManagementSystem.service.BookingService;

@RestController
public class BookingController { 

    @Autowired
    private BookingService bookingService;

    @PostMapping(value = "/booking")
    private Booking addBooking(@RequestBody Booking booking){
    	
    	System.out.println("booking:"+booking);
        return bookingService.addBooking(booking);

    }

    @GetMapping(value = "/booking/user/{id}")
    private List<Booking> viewBookingByUser(@PathVariable(value = "id") Long userId){
        return bookingService.viewBooking(userId);
    }

    @GetMapping(value = "/booking")
    private List<Booking> viewBooking(){
        return bookingService.viewBooking();
    }

    @PutMapping(value = "/booking")
    private Booking modifyBooking(@RequestBody Booking booking){
        return bookingService.modifyBooking(booking);
    }

    @DeleteMapping(value = "/booking/{id}")
    private void deleteBooking(@PathVariable(value = "id") Long bookingid){
        bookingService.deleteBooking(bookingid);
    }
}  