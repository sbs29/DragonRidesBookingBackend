package com.example.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.entities.Booking;
import com.example.proyecto.repository.BookingRepository;

@Service
public class BookingService extends AbstractService<Booking> {

	@Autowired
	public void setBookingRepoditory(BookingRepository bookingRepository) {
		super.setRepository((CrudRepository<Booking, Long>) bookingRepository);
	}
}
