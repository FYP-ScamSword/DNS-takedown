package com.scamsword.takedown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

import org.openqa.selenium.WebDriver;

@SpringBootApplication
@RestController
public class TakedownApplication {

	public static void main(String[] args) {
		SpringApplication.run(TakedownApplication.class, args);
	}

	@GetMapping("/health")
	public String health() {
        String message = String.format("Service is healthy! Current time: %s",
            Calendar.getInstance().getTime());
		return message;
	}
}
