package com.example.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entities.Booking;
import com.example.entities.Flight;
import com.example.proyecto.service.BookingService;

@Controller
@RequestMapping("/booking")
public class BookingController extends AbstractController<Booking> {

	@Autowired
	protected void setBookingService(BookingService service) {
		super.setService(service);
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "{id}/flight")

	public List<Flight> getBookingByFlight(@PathVariable("id") Long flightId) {
		return ((BookingService) getService()).getBookingByFlight(flightId);
	}
}