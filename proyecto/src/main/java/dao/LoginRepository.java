package dao;

import org.springframework.data.repository.CrudRepository;
import entities.Login;

public interface LoginRepository extends CrudRepository<Login, Long>{

}
