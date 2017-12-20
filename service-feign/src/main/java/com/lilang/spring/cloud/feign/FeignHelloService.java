package com.lilang.spring.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: lilang
 * Date: 2017/12/19 ProjectName: cloud-eureka Version：5.0.0
 */
@FeignClient(value = "service-hehe",fallback = FeignHelloServiceHystric.class)
public interface FeignHelloService {


    @RequestMapping(value = "/hehe", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);

}
