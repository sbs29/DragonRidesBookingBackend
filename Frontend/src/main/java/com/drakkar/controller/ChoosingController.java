package com.drakkar.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChoosingController {
	@RequestMapping("/ChoosePage")
	public String CHoosing(Map<String, Object>model) {
		return "Choosing";
	}

}
