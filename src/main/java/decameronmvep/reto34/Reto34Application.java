//Categoria,mensaje ,Reservacion,cliente
//1. Moelo o entidad
//2. Interfaces 
//3.repositorio
//servicios
//controlador o web


package decameronmvep.reto34;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages ={"decameronmvep.reto34.Modelo"})
public class Reto34Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto34Application.class, args);
	}

}
