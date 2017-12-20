package com.lilang.spring.cloud.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: lilang
 * Date: 2017/12/20 ProjectName: cloud-eureka Version：5.0.0
 */
@Component
public class FeignHelloServiceHystric implements FeignHelloService{
    @Override
    public String sayHello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", error happened!";
    }
}
