package dao;

import org.springframework.data.repository.CrudRepository;
import entities.Booking;

public interface BookingRepository extends CrudRepository<Booking, Long>{

}
