package com.example.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Destination;

@Repository
public interface DestinationsRepository extends CrudRepository<Destination, Long> {

	@Query("select f from Flight as f where f.origin.id = :originId") // f inner join f.destination dest
	List<Destination> getDestinationsByOriginOrderByPriceAsc(@Param("originId") Long originId);
	


}
