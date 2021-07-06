package com.example.demospringboot;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demospringboot.Controller.Sathish;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootApplication.class, args);
/*Sathish s=context.getBean(Sathish.class);
		s.setName("Sathishkumar");
		s.setNo(10);
		System.out.println(s.getName());
		System.out.println(s.getNo());*/
	}

}
