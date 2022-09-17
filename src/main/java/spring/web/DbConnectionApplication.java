package spring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DbConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbConnectionApplication.class, args);
	}

}
