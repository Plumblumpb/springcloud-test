package com.plumblum.eurekareignclient.service;

import com.plumblum.eurekareignclient.config.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: cpb
 * @Date: 2018/9/28 18:54
 * @Description:
 */
@Service
public class HiService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name){
        return  eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
