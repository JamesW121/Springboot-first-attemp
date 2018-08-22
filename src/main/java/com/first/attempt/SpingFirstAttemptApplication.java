package com.first.attempt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.first.attempt.domain.First;
import com.first.attempt.service.FirstService;

@SpringBootApplication
public class SpingFirstAttemptApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingFirstAttemptApplication.class, args);
	}
}
