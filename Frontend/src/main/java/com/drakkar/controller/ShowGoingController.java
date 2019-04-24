package com.drakkar.controller;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ShowGoingController {
	@RequestMapping("/ShowGoing")
	public String show(Map<String, Object> model) {
		return "ShowGoing";

}
}
