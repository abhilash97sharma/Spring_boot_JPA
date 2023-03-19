package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.model"})  // used to specify the packages of the entity class
@ComponentScan(basePackages = {"com.example.controller", "com.example.service"} )  // used to specify the package of controller and service classes
@EnableJpaRepositories("com.example.Repo")  // used to specify the package of the repo interface
public class SpringBootJpaMsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaMsWebApplication.class, args);
	}

}
