package com.lilang.springcloud.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: lilang
 * Date: 2017/12/19 ProjectName: cloud-eureka Version：5.0.0
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String sayHello(String name) {
        return restTemplate.getForObject("http://service-hehe/hehe?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hello, " + name + ", error happened!";
    }

}
