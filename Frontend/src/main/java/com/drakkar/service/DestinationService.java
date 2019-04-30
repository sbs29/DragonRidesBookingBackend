package com.drakkar.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.drakkar.model.Destination;
import com.example.drakkar.util.CachedObject;
import com.example.drakkar.util.Wipeable;

@Service
public class DestinationService implements Wipeable {

	private static final long ONE_HOUR_IN_MILLIS = 1000 * 60 * 60;

	private CachedObject<List<Destination>> cachedDestinations =
			new CachedObject<List<Destination>>(
					1000,
					() -> innerFindAll());

	public List<Destination> findAll() {
        return cachedDestinations.get();
    }

	private List<Destination> innerFindAll() {
		RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Destination>> response = restTemplate.exchange(
        		  "http://localhost:8080/destination/", //TODO get the url from the app configuration.
        		  HttpMethod.GET,
        		  null,
        		  new ParameterizedTypeReference<List<Destination>>(){});
        return response.getBody();
	}

	@Override
	public void wipeOut() {
		cachedDestinations.wipeOut();
	}

}
