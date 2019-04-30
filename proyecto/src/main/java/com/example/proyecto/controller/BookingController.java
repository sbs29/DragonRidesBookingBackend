package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.drakkar.model.Booking;
import com.example.proyecto.service.BookingService;

@Controller
@RequestMapping("/booking")
public class BookingController extends AbstractController<Booking> {

	@Autowired
	protected void setBookingService(BookingService service) {
		super.setService(service);
	}
} 