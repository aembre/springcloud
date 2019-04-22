package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fallback指定服务均不可用时的默认处理
 */
@FeignClient(value = "eureka-client",fallback = DefaultFeignServiceImp.class)
public interface FeignService {

    @GetMapping("/hi")
    String sayHi(@RequestParam("name") String name);

}
