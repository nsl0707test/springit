package com.vega.springit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringitApplication {


	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return args -> {
//			System.out.println("Available beans into the app.");
//			String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//			Arrays.asList(beanDefinitionNames).forEach(System.out::println);
		};
	}

}
