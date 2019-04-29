package com.drakkar.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.drakkar.domain.Destination;

@Service
public class DestinationService {

	public List<Destination> findAll() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Destination>> response = restTemplate.exchange(
        		  "http://localhost:8080/destination/", //TODO get the url from the app configuration.
        		  HttpMethod.GET,
        		  null,
        		  new ParameterizedTypeReference<List<Destination>>(){});
        return response.getBody();
    }

}
