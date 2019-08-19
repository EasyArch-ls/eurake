package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Hello {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Hello.class).web(true).run(args);
    }
}
