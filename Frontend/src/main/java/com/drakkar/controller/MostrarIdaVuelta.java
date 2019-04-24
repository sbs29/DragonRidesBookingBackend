package com.drakkar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MostrarIdaVuelta {
	@RequestMapping("/IdaVuelta")
	public String Mostrar2(Map<String, Object> model) {
		return "IdaVuelta";

}
}
