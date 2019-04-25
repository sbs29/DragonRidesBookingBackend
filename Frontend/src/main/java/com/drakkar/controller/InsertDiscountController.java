package com.drakkar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertDiscountController{
	
	@RequestMapping("/insertarDiscount")
	public String insertarD(Map<String, Object> model) {
			return "InsertarDiscount";

			}
			}
