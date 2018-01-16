package com.sxc.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service  //ribbon方式
public class ShellTestService {

    @Autowired 
    RestTemplate t;

    @HystrixCommand(fallbackMethod = "fallback1")
    public void test() {
       System.out.println( t.getForObject("http://shell/test", String.class));
    }
    
    
    public void fallback1(){
        System.out.println("ShellTestService 故障");
    }
}   
