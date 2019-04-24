package com.drakkar.controller;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MostrarIdaController {
	@RequestMapping("/paginaMostrarIda")
	public String Mostrar(Map<String, Object> model) {
		return "PaginaMostrarIda";

}
}
