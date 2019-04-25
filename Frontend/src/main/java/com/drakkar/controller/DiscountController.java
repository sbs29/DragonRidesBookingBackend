package com.drakkar.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.drakkar.service.DiscountService;

@Controller
public class DiscountController {

	@Autowired
	private DiscountService service;

<<<<<<< HEAD
	@RequestMapping("/")
	public String Discount(Map<String, Object> model) {
=======
	@RequestMapping("/discount")
	public String discount(Map<String, Object> model) {
>>>>>>> e4cb6a1b98cefb54edccbac65e7fb1389b6d5c8c
		return "discount";
	}

}
