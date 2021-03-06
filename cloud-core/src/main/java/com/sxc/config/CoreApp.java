package com.sxc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient // 作为eureka的client端
@RestController
public class CoreApp {
    @RequestMapping("/test")
    public String test() {
        return "coretest";
    }

    public static void main(String[] args) {
        SpringApplication.run(CoreApp.class, args);
    }
}
