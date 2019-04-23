package dao;

import org.springframework.data.repository.CrudRepository;
import entities.Airlines;

public interface AirlinesRepository extends CrudRepository<Airlines, Long>{

}
