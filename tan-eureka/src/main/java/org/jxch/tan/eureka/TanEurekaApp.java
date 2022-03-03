package org.jxch.tan.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TanEurekaApp {
    public static void main(String[] args) {
        SpringApplication.run(TanEurekaApp.class, args);
    }
}
