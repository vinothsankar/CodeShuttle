package com.weekOne.AliceBakery;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceBakeryApplication implements CommandLineRunner {

	@Autowired
	CakeBaker cakebaker;

	public static void main(String[] args) {
		SpringApplication.run(AliceBakeryApplication.class, args);
	}

//	@PostConstruct
//	public void bakeCake(){
//		System.out.println(cakebaker.BakeCake());
//	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println(cakebaker.BakeCake());
	}


}
