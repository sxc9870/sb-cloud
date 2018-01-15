package com.sxc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//作为eureka的client端
public class CoreApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(CoreApp.class        , args);
    }
}
