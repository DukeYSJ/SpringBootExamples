package com.duke.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMavenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMavenWebApplication.class, args);
		System.out.println("web spring boot project");
	}

}
