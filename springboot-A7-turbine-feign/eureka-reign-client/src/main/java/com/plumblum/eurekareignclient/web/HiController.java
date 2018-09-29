package com.plumblum.eurekareignclient.web;

import com.plumblum.eurekareignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: cpb
 * @Date: 2018/9/28 18:55
 * @Description:
 */
@RestController
public class HiController {
    @Autowired
    HiService hiService;
    @GetMapping("/hi")
    public String sayHi(@RequestParam( defaultValue = "test",required = false)String name){
        return hiService.sayHi(name);
    }
}