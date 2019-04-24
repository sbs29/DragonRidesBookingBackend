package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Booking;

public interface BookingRepository extends CrudRepository<Booking, Long>{

}
