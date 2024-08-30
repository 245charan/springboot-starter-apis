package com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootStarterApisApplication implements CommandLineRunner {
	@Autowired
	DB db;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStarterApisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(db.getData());
	}
}
