
package com.drakkar.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drakkar.form.BookingForm;
import com.drakkar.service.BookingService;
import com.example.drakkar.model.Booking;

@Controller
@RequestMapping("booking")
public class BookingController {

	@Autowired
	BookingService bookingService;

	@RequestMapping("/Booking")
	public String booking(Map<String, Object> model) {
		return "Booking";
	}

	@RequestMapping(method = RequestMethod.POST, consumes = {"application/x-www-form-urlencoded;charset=UTF-8", "application/json"})
	public String create(BookingForm form, Map<String, Object> model) {
		//TODO validate the form!!!!!

		Booking booking = bookingService.create(form.getFlightId(), form.getUserId());
		model.put("booking", booking);
		return "bookingDetails";
	}
}
