package com.drakkar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiscountController {

	
	@RequestMapping("/discount")
	public String discount(Map<String, Object> model) {

		return "discount";
	}

}
