package com.lilang.spring.cloud.config.client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConfigClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient2Application.class, args);
	}

	@Value("${foo}")
	private String foo;

	@RequestMapping("/hi")
	public String hi() {
		return foo;
	}
}
