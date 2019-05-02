package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.proyecto.service.DestinationsService;

@Controller
@RequestMapping("/destination")
public class DestinationsController extends AbstractController<com.example.drakkar.model.Destination>{

	@Autowired
	public void setDestinationsService(DestinationsService service) {
		super.setService(service);
	}

	//TODO review, please
//	@ResponseBody
//	@RequestMapping(method = RequestMethod.GET, path = "{id}/destination")
//	public List<Flight> getFlightsByOriginOrderByPriceAsc(@PathVariable("id") Long originId) {
//		return ((DestinationsService) getService()).getFlightsByOriginOrderByPriceAsc(originId);
//	}

}
