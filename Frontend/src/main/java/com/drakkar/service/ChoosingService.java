package com.drakkar.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.drakkar.domain.Discount;

public class ChoosingService {

	public List<Discount> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Discount>> response = restTemplate.exchange(
        		  "http://localhost:8080/discount/", //TODO get the url from the app configuration
        		  HttpMethod.GET,
        		  null,
        		  new ParameterizedTypeReference<List<Discount>>(){});
        return response.getBody();
	}


	public static void main(String[] args) {
		System.out.println(new DiscountService().findAll());
	}

}
