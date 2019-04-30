package com.drakkar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertDiscountController {

	@RequestMapping("/insertDiscount")
	public String insertrD(Map<String, Object> model) {
		return "InsertDiscount";

	}
}
