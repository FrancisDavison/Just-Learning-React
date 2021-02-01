package com.example.Just_Learning_React;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JustLearningReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustLearningReactApplication.class, args);
	}

}
