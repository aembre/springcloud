package com.example.feign.service;

import org.springframework.stereotype.Component;

@Component
public class DefaultFeignServiceImp implements FeignService {

    @Override
    public String sayHi(String name) {
        return "sorry," + name + ".system error";
    }
}
