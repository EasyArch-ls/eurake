package com;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/getServices")
    public String getServices() {
        String Services = "Servies :" + discoveryClient.getServices();
        return Services;
    }
}
