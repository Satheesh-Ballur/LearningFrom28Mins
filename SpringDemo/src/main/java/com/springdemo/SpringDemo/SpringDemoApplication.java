package com.springdemo.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext cxt =	SpringApplication.run(SpringDemoApplication.class, args);
		
		for(String s: cxt.getBeanDefinitionNames())
		{
			System.out.println(s);
		}
		
	}

}
