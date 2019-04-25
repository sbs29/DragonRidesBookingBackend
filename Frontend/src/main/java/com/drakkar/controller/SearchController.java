package com.drakkar.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SearchController {

<<<<<<< HEAD
		@RequestMapping("/Search")
		public String search(Map<String, Object> model) {
			return "Search";


	}
=======
	@RequestMapping("/Search")
	public String search(Map<String, Object> model) {
		return "Search";
>>>>>>> fb9f39e448c78f5a9615b6494441db9777415562
	}
}


