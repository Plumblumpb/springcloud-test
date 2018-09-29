package com.plumblum.monitorturbineclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class MonitorTurbineClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorTurbineClientApplication.class, args);
    }
}
