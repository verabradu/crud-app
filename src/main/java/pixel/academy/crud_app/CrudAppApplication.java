package pixel.academy.crud_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudAppApplication {

	public static void main(String[] args) {SpringApplication.run(CrudAppApplication.class, args);}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner ->{
			System.out.println("Hello, World!");
		};
	}
}
