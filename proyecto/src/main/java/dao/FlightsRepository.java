package dao;

import org.springframework.data.repository.CrudRepository;
import entities.Flights;

public interface FlightsRepository extends CrudRepository<Flights, Long>{

}
