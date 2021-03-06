package com.sxc.shell;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ShellApp {
    @Value("${shell.message}")
    private String message;
    
    @RequestMapping("/test")
    public String test() {
        return "shellTest";
    }

    public static void main(String[] args) {
        SpringApplication.run(ShellApp.class, args);
    }
}
