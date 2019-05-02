package com.example.proyecto.controller;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.drakkar.model.Flight;
import com.example.proyecto.service.FlightService;

@Controller
@RequestMapping("/flight")
public class FlightController extends AbstractController<Flight> {

	@Autowired
	protected void setFlightService(FlightService service) {
		super.setService(service);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "/flight")
	
	public List<Flight> getFlightOrderByPrice(@RequestParam("idOrigin") Long originId, @RequestParam("idDestination") Long destinationId,
			@RequestParam("fromArrivalDate") String fromArrivalDate, @RequestParam("toArrivalDate") String toArrivalDate,
			@RequestParam("fromDepartureDate") String fromDepartureDate, @RequestParam("toDepartureDate") 
			String toDepartureDate) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		java.util.Date dateFrom = simpleDateFormat.parse(fromArrivalDate);
		java.sql.Date sqlDateFrom = new java.sql.Date(dateFrom.getTime());
		java.util.Date dateTo = simpleDateFormat.parse(toArrivalDate);
		java.sql.Date sqlDateTo = new java.sql.Date(dateTo.getTime());
		java.util.Date dateFrom1 = simpleDateFormat.parse(fromDepartureDate);
		java.sql.Date sqlDateFrom1 =new java.sql.Date(dateFrom1.getTime());
		java.util.Date dateTo1 = simpleDateFormat.parse(toDepartureDate);
		java.sql.Date sqlDateTo1 = new java.sql.Date(dateTo1.getTime());
		
		
		
		return ((FlightService) getService()).getFlightOrderByPrice(originId, destinationId, sqlDateFrom, sqlDateTo,
				sqlDateFrom1, sqlDateTo1);
	}

}