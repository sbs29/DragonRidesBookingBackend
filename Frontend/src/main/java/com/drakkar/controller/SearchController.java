package com.drakkar.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SearchController {

	
	
		@RequestMapping("/Search")
		public String search(Map<String, Object> model) {
			return "Search";

	}
	}


