package com.sxc.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service//Feign方式
public class CoreTestService {

    @Autowired
    TestApi t;

   @HystrixCommand(fallbackMethod = "fallback")//加了感觉成异步调用了,断路器
    public void test() {
     System.out.println(  t.test());
    }
    
    
    public void fallback(){
        
        System.out.println(" CoreTestService 故障");
    }
}   
