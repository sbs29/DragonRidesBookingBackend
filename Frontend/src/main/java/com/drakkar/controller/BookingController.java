package com.drakkar.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

	@RequestMapping("/booking")
	public String booking(Map<String, Object> model) {
		return "PaginaBooking";

}
}
