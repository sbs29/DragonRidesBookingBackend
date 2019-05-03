package com.example.proyecto.service;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.drakkar.model.Discount;
import com.example.drakkar.model.Flight;
import com.example.drakkar.vo.FlightSearchResult;
import com.example.proyecto.repository.FlightRepository;

@Service
public class FlightService extends AbstractService<Flight> {

	@Autowired
	private DiscountService discountService;

	@Autowired
	public void setFlightRepository(FlightRepository flightRepository) {
		super.setRepository((CrudRepository<Flight, Long>) flightRepository);
	}

	public List<Flight> getFlightOrderByPrice(Long originId, Long destinationId, Date fromArrivalDate,
			Date toArrivalDate, Date fromDepartureDate, Date toDepartureDate) {
		return ((FlightRepository) getRepository()).getFlightOrderByPrice(originId, destinationId, fromArrivalDate,
				toArrivalDate, fromDepartureDate, toDepartureDate);
	}

	public List<FlightSearchResult> searchFlights(
			Long originId,
			Long destinationId,
			java.util.Date departureDate,
			java.util.Date arrivalDate) {
		List<FlightSearchResult> flights = ((FlightRepository) getRepository()).searchFlights(
				originId,
				destinationId,
				getPrevDay(departureDate),
				getNextDay(departureDate),
				getPrevDay(arrivalDate),
				getNextDay(arrivalDate));
		populateDiscount(flights);
		return flights;
	}

	private void populateDiscount(List<FlightSearchResult> flights) {
		flights.forEach(this::populateDiscount);
	}


	private void populateDiscount(FlightSearchResult flight) {
		Discount discount = discountService.getMaxDiscount(flight.getOutbound(), flight.getInbound());
		flight.setDiscount(discount);
	}

	private java.util.Date getNextDay(java.util.Date date) {
		if (date == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	private java.util.Date getPrevDay(java.util.Date date) {
		if (date == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
	}

}
