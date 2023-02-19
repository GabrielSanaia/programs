package com.example.programs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProgramsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgramsApplication.class, args);
    }

}
