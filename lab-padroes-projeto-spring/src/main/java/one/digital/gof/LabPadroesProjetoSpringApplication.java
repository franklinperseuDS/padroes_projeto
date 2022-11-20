package one.digital.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  Projeto Spring Boot gerado via spring Initializr
 *   os seguintes modulos foram selecionados:
 *   - Spring Data JPA
 *   - Spring web
 *   - H2 Database ( banco em memoria)
 *   - OpenFeing
 *   - adicionado manualmente Swagger
 *
 *  @author FranklinPerseuDS
 */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
