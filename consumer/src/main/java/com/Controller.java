package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/getConsumer")
    public String getConsumer(){
        ServiceInstance serviceInstance=loadBalancerClient.choose("lyh");
        System.out.println(serviceInstance.getHost());
        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/getServices";
        return restTemplate.getForObject(url, String.class);
    }
}
