package com.drakkar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ShowGoingBackController {
	@RequestMapping("/GoingBack")
	public String show2(Map<String, Object> model) {
		return "GoingBack";

}
}
