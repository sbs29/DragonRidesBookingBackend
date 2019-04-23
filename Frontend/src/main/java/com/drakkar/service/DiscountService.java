package com.drakkar.service;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.drakkar.domain.Discount;

public class DiscountService {

	public List<Discount> findAll() throws RestClientException, URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Discount>> response = restTemplate.exchange(
        		  "http://localhost:8080/discount/",
        		  HttpMethod.GET,
        		  null,
        		  new ParameterizedTypeReference<List<Discount>>(){});
        return response.getBody();
	}


	public static void main(String[] args) throws RestClientException, URISyntaxException {
		System.out.println(new DiscountService().findAll());
	}
}