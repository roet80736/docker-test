package com.xiciwutong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wutong
 * @date 2018/9/7
 */
@SpringBootApplication
@RestController
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class);
	}

	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}

}
