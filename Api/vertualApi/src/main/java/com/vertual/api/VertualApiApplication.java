package com.vertual.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@CrossOrigin
public class VertualApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VertualApiApplication.class, args);
	}

	@RequestMapping(value="/")
	public Map test() {
		Map<String,String> m = new HashMap<>();
		m.put("key", "success yeep yooo");
		return m;
	}
	
}
