package com.lilang.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lilang
 * Date: 2017/12/19 ProjectName: cloud-eureka Version：5.0.0
 */
@RestController
public class HelloController {


    @Autowired
    private HelloService helloService;

    @RequestMapping("/hehe")
    public String hehe(@RequestParam String name) {
        return helloService.sayHello(name);
    }

}
