package com.riverfount.JavaLibraryManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JavaLibraryManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaLibraryManagerApplication.class, args);
	}

}
