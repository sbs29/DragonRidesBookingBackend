package com.drakkar.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.drakkar.model.Booking;

@Service
public class BookingService {

//	public List<Discount> findAll() {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<List<Discount>> response = restTemplate.exchange(
//        		  "http://localhost:8080/booking/", //TODO get the url from the app configuration
//        		  HttpMethod.GET,
//        		  null,
//        		  new ParameterizedTypeReference<List<Discount>>(){});
//        return response.getBody();
//	}

	public Booking create(Long flightId, Long userId) {
        RestTemplate restTemplate = new RestTemplate();

        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("flightId", Long.toString(flightId));
        parameters.put("userId", Long.toString(userId));
		ResponseEntity<Booking> response = restTemplate.postForEntity(
				"http://localhost:8080/booking/create", //TODO get the url from the app configuration
				parameters,
        		Booking.class);
        return response.getBody();
	}

	public static void main(String[] args) {
		BookingService tt = new BookingService();
		tt.create(32L, 54L);
	}



}
