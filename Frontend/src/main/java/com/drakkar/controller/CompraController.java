package com.drakkar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CompraController {
	@RequestMapping("/Compra")
	public String Compra(Map<String, Object> model) {
		return "Compra2";

}
}


