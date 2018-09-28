package com.plumblum.eurekaribbonclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
//        不需要硬编码（指定ip），只需要使用spring.application.name 即可。
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return   "hi,"+name+",error !!!";
    }
}
