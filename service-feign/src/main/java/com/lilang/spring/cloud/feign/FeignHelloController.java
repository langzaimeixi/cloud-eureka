package com.lilang.spring.cloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lilang
 * Date: 2017/12/19 ProjectName: cloud-eureka Version：5.0.0
 */
@RestController
public class FeignHelloController {

    @Autowired
    private FeignHelloService feignHelloService;

    @RequestMapping("/hehe")
    public String sayHello(@RequestParam String name) {
        return feignHelloService.sayHello(name);
    }

}
