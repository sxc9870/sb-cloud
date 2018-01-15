package com.sxc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer//启动配置服务
@EnableEurekaClient//作为eureka的client端
public class ConfigApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigApp.class        , args);
    }
}
