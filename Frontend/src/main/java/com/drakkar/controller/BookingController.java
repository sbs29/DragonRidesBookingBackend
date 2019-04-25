
package com.drakkar.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

	@RequestMapping("/Booking")
	public String booking(Map<String, Object> model) {
<<<<<<< HEAD
		return "PaginaBooking";

	}
}

=======
		return "Booking";
	}
	}
>>>>>>> 8508c6776c3ddf77a350e940e02dd8d39ffeef55
