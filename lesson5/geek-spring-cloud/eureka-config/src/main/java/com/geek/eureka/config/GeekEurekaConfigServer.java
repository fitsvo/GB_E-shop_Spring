package com.geek.eureka.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GeekEurekaConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(GeekEurekaConfigServer.class, args);
    }
}
