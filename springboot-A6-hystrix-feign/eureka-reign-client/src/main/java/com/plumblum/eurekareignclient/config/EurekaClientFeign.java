package com.plumblum.eurekareignclient.config;


import com.plumblum.eurekareignclient.Hystrix.HiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: cpb
 * @Date: 2018/9/28 18:52
 * @Description:
 */
@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {

    @GetMapping("/hi")
    public String sayHiFromClientEureka(@RequestParam(value = "name") String name);

}
