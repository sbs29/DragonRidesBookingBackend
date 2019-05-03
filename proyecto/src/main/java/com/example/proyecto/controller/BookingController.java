package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.drakkar.model.Booking;
import com.example.drakkar.model.Flight;
import com.example.proyecto.service.BookingService;

@Controller
@RequestMapping("/booking")
public class BookingController extends AbstractController<Booking> {

	@Autowired
	protected void setBookingService(BookingService service) {
		super.setService(service);
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, path = "create")
	public Booking create(@RequestBody BookingMetaInfo bookingMeta) {
//		System.out.println("created " + bookingMeta.getFlightId() + ", " + bookingMeta.getUserId());
		//TODO ...
		return Booking.builder()
				.withFlight(Flight.builder()
						.build())
				.build();
	}

}