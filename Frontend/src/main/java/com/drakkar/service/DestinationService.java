package com.drakkar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drakkar.domain.Destination;

@Service
public class DestinationService {

	public List<Destination> findAll() {
		//TODO get this from a remote REST call
		List<Destination> destinations = new ArrayList<Destination>();
		Destination e = new Destination();
		e.setId(32L);
		e.setName("nombre 32");
		destinations.add(e);
		e = new Destination();
		e.setId(45L);
		e.setName("cuarenta y cinco");
		destinations.add(e);
		return destinations;
	}

}
