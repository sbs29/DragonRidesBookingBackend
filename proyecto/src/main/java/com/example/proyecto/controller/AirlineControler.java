package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.drakkar.model.Airline;
import com.example.proyecto.service.AirlineService;


@Controller
@RequestMapping("/airline")
public class AirlineControler extends AbstractController<Airline> {
	
	@Autowired
	protected void setAirlineService(AirlineService service) {
		super.setService(service);
	}
	
}
