package com.seongbin.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class projectDiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(projectDiaryApplication.class, args);
	}

}
