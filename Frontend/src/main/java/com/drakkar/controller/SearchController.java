package com.drakkar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.drakkar.domain.Destination;
import com.drakkar.service.DestinationService;

@Controller
public class SearchController {

	@Autowired
	private DestinationService destinationService;

	// TODO whereTF is the flight service?!?!?!?!?!
//	@Autowired
//	private FlightService flightService;


	@RequestMapping("/")
	public String search(Map<String, Object> model) {
		List<Destination> destinations = this.destinationService.findAll();
		model.put("departures", destinations);
		return "Search";
	}

	@RequestMapping("/Search")
	public String search(@RequestParam Map<String, String> parameters, Map<String, Object> model) {
		model.put("parameters", parameters);

		String originId = parameters.get("originId");
		List<String> errors = new ArrayList<String>();
		if (null == originId || "".equals(originId)) {
			errors.add("You must select an origin!");
		}
		String destinationId = parameters.get("destinationId");
		if (null == destinationId || "".equals(destinationId)) {
			errors.add("You must select a destination!");
		}
		//TODO more errors when missing departure date and return date

		if (errors.isEmpty()) {
			//TODO search and forward to search results page
			// flightCriteria or flight must be created an populated
			//model.put("flights", flightService.search(flightCriteria));
			return "TODO search result page name goes here!";
		} else {
			model.put("errors", errors);
		}

		List<Destination> destinations = this.destinationService.findAll();
		model.put("departures", destinations);
		return "Search";
	}

}
