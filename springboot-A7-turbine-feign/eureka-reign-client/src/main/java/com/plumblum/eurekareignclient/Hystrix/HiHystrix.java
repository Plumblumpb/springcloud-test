package com.plumblum.eurekareignclient.Hystrix;

import com.plumblum.eurekareignclient.config.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @Auther: cpb
 * @Date: 2018/9/28 19:27
 * @Description:
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi,"+name+",error!!!";
    }
}
