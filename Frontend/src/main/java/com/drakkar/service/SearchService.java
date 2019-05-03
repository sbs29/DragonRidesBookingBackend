package com.drakkar.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.drakkar.vo.FlightSearchResult;

public class SearchService {

	public List<FlightSearchResult> flight(Long idOrigin, Long idDestination, String departureDate,
			String arrivalDate) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<FlightSearchResult>> response = restTemplate.exchange(
				"http://localhost:8080/flight/?idOrigin=" + idOrigin + "&idDestination=" + idDestination
						+ "&departureDate=" + departureDate + "&arrivalDate=" + arrivalDate,
				// TODO get the url from the app configuration
				HttpMethod.GET, null, new ParameterizedTypeReference<List<FlightSearchResult>>() {
				});
		return response.getBody();
	}

	public static void main(String[] args) {
		System.out.println(new DiscountService().findAll());
	}

}
