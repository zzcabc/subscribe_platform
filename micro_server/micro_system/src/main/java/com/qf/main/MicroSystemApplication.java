package com.qf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MicroSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroSystemApplication.class, args);
    }

}
