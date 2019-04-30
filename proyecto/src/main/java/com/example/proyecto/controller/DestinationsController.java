package com.example.proyecto.controller;

import java.util.List;

import javax.print.attribute.standard.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entities.Destination;
import com.example.entities.Flight;
import com.example.proyecto.service.DestinationsService;

@Controller
@RequestMapping("/destination")
public class DestinationsController extends AbstractController<com.example.drakkar.model.Destination>{

	@Autowired
	public void setDestinationsService(DestinationsService service) {
		super.setService(service);
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "{id}/destination")
	
	public List<Flight> getFlightsByOriginOrderByPriceAsc(@PathVariable("id") Long originId) {
		return ((DestinationsService) getService()).getFlightsByOriginOrderByPriceAsc(originId);
	}



}
