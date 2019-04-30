package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.drakkar.model.Flight;
import com.example.proyecto.service.FlightsService;

@Controller
@RequestMapping("/flights")
public class FlightsController extends AbstractController<Flight> {

	@Autowired
	protected void setFlightsService(FlightsService service) {
		super.setService(service);
	}

}