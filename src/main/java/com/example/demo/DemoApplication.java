package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemoApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Application is running...!");
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/")
class HelloWorld{
	@GetMapping
	public String sayHello(){
		return "hello from boot";
	}

	@GetMapping("/add")
	public double add(@RequestParam int a,@RequestParam int b){
		return a+b;
	}
}
