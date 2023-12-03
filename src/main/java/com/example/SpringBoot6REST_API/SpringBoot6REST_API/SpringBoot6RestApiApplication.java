package com.example.SpringBoot6REST_API.SpringBoot6REST_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBoot6RestApiApplication extends SpringBootServletInitializer{

	  @Override
	    protected SpringApplicationBuilder configure(
	      SpringApplicationBuilder builder) {
	        return builder.sources(SpringBoot6RestApiApplication.class);
	    }
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot6RestApiApplication.class, args);
	}

}
