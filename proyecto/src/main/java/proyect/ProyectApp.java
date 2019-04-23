package proyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping({"com.example.proyecto.controller", "com.example.proyecto.service"})
public class ProyectApp {

	public static void main(String[] args) {
		SpringApplication.run(ProyectApp.class, args);
	}

}
