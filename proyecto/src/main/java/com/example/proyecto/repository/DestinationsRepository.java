package com.example.proyecto.repository;

import java.util.List;

import javax.print.attribute.standard.Destination;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationsRepository extends CrudRepository<com.example.drakkar.model.Destination, Long> {

	@Query("select f from Flight as f where f.origin.id = :originId") // f inner join f.destination dest
	List<Destination> getDestinationsByOriginOrderByPriceAsc(@Param("originId") Long originId);



}
