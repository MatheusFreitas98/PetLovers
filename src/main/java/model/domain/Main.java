package model.domain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    @Bean
    public CommandLineRunner init () {
        System.out.println("Application Started...");
        return null;
    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}