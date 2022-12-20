package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BankapplicationApplication {

	public static void main(String[] args) {
	  SpringApplication.run(BankapplicationApplication.class, args);
	  userpwd uer=new userpwd();
	  uer.bankpwd();
		
	}

}
