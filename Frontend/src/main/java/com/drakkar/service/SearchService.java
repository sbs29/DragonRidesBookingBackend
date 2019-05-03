package com.drakkar.service;

import java.lang.reflect.Parameter;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.drakkar.model.Discount;

public class SearchService {

	public flight {
        RestTemplate restTemplate = new RestTemplate();
        parameters.put("flightId",long.toString(flightId));
        parameters.put
        ResponseEntity<List<flight>> response = restTemplate.exchange(
        		  "http://localhost:8080/flights/", //TODO get the url from the app configuration
        		  HttpMethod.GET,
        		  null,
        		  new ParameterizedTypeReference<List<Discount>>(){});
        return response.getBody();
	}


	public static void main(String[] args) {
		System.out.println(new DiscountService().findAll());
	}

}
