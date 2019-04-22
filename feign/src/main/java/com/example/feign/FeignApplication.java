package com.example.feign;

import com.example.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class FeignApplication {

    @Autowired
    FeignService feignService;

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    @GetMapping("/hi")
    public String hi(@RequestParam(defaultValue = "zwj") String name){
        return feignService.sayHi(name);
    }

}
