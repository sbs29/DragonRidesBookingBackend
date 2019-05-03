package com.example.proyecto.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.drakkar.model.Flight;
import com.example.drakkar.vo.FlightSearchResult;
import com.example.proyecto.service.FlightService;

@Controller
@RequestMapping("/flight")
public class FlightController extends AbstractController<Flight> {

	private static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";

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

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_YYYY_MM_DD);

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

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "/search")
	public List<FlightSearchResult> searchFlights(
			@RequestParam(required = false, name = "idOrigin") Long originId,
			@RequestParam(required = false, name = "idDestination") Long destinationId,
			@RequestParam(required = false, name = "departureDate") String pDepartureDate,
			@RequestParam(required = false, name = "arrivalDate") String pArrivalDate) {

		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_YYYY_MM_DD);
		Date departureDate = null;
		Date arrivalDate = null;
		if (!StringUtils.isEmpty(pDepartureDate) && isValid(pDepartureDate)) {
			try {
				departureDate = sdf.parse(pDepartureDate);
			} catch (ParseException e) {
				//TODO log or throw
			}
		}
		if (!StringUtils.isEmpty(pArrivalDate) && isValid(pArrivalDate)) {
			try {
				arrivalDate = sdf.parse(pArrivalDate);
			} catch (ParseException e) {
				//TODO log or throw
			}
		}

		return ((FlightService) getService()).searchFlights(
				originId,
				destinationId,
				departureDate,
				arrivalDate);

	}

	private boolean isValid(String departureDate) {
		// TODO
		return true;
	}

}