package com.drakkar.controller;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertarVuelosController
{

		@RequestMapping("/InsertV")
		public String insert(Map<String, Object> model) {
			return "InsertarVuelos";

	}
	}


