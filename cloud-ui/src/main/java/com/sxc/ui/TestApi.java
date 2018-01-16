package com.sxc.ui;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("core")
public interface TestApi {

    
    
    @RequestMapping("/test")
    String test();    
}
