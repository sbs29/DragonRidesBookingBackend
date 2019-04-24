package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Destination;
import com.example.proyecto.service.DestinationsService;

@Controller
@RequestMapping("/destination")
public class DestinationsController extends AbstractController<Destination>{

	@Autowired
	public void setDestinationsService(DestinationsService service) {
		super.setService(service);
	}
}
