package com.sxc.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients // 开启feign支持
@EnableCircuitBreaker // circuit支持
@EnableZuulProxy // 网关代理支持 Hystrix仪表盘需要先激活一次  /monitor/**
@RestController
@EnableHystrix
public class UiApp {
    
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Autowired
    private CoreTestService coreTestService;

    @Autowired
    private ShellTestService shellTestService;

    @RequestMapping("/hellow")
    private void a() {
        
        
        
        coreTestService.test();
        shellTestService.test();
    }

    public static void main(String[] args) {
         SpringApplication.run(UiApp.class, args)
         ;
    }
}
