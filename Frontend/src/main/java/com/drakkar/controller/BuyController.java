package com.drakkar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BuyController {
	@RequestMapping("/Buy")
	public String buy(Map<String, Object> model) {
		return "Buy";

}
}


