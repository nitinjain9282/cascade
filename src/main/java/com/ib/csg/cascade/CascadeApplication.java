package com.ib.csg.cascade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class CascadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CascadeApplication.class, args);
	}

}
