package com.cg.iter.FlightManagementSystem.Pojo;

import java.util.Date;
import java.util.List;

import com.cg.iter.FlightManagementSystem.dto.Airport;
import com.fasterxml.jackson.annotation.JsonFormat;

public class SearchScheduleFlight {

    private List<Airport> airports;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
    private Date localDate;

    public SearchScheduleFlight() {
    }

    public SearchScheduleFlight(List<Airport> airports, Date localDate) {
        this.airports = airports;
        this.localDate = localDate;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    public Date getLocalDate() {
        return localDate;
    }

    public void setLocalDate(Date localDate) {
        this.localDate = localDate;
    }
}
