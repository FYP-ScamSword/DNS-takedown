package com.scamsword.takedown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

import org.openqa.selenium.WebDriver;

@SpringBootApplication
@RestController
public class TakedownApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TakedownApplication.class, args);
    }

    @Getter
    @Setter
    public class HealthMessage {
        private String message;
        private String timestamp;

        public HealthMessage(String message, String timestamp) {
            this.message = message;
            this.timestamp = timestamp;
        }
    }

    /**
     * Endpoint for service health check
     *
     * @return JSON object with message and timestamp
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/health")
    public HealthMessage health() {
        return new HealthMessage(
            "Service is healthy!",
            Calendar.getInstance().getTime().toString()
        );

    }
}
