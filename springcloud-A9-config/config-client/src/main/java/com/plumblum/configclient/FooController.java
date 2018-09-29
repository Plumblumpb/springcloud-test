package com.plumblum.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: cpb
 * @Date: 2018/9/29 14:28
 * @Description:
 */
@RestController
public class FooController {

    @Value("${foo}")
    private String foo;

    @GetMapping("/foo")
    public String getFoo(){
        return foo;
    }
}
