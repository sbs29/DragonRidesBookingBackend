<<<<<<< HEAD
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
=======
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
=======
		return "Booking";
>>>>>>> 5e151b7cd0d0ed8a09e69473d77583ea641f9688

}
}
>>>>>>> e4cb6a1b98cefb54edccbac65e7fb1389b6d5c8c
