package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long>{

}
