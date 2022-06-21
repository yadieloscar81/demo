package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "maria@gmail.com",
                    LocalDate.of(2000,4,23)

            );
            Student Shandor = new Student(
                    "Shandor",
                    "sa@gmail.com",
                    LocalDate.of(1997,5,23)
            );
            repository.saveAll(
                    List.of(mariam,Shandor)
            );
        };
    }
}
