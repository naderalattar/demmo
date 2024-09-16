package com.example.demo;

import com.example.demo.service.Account;
import com.example.demo.service.TestService;
import com.example.demo.service.TrackService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("master-one");
	}

	//@Bean
	public CommandLineRunner commandLineRunner(TrackService trackService, TestService testService){
		return c->{
			Account account=new Account("nader",23);
			System.out.println();
			trackService.addNewAccount(account);
			System.out.println("------------------------------");
			trackService.addNewAccount2(account);
			System.out.println("------------------------------");
//			testService.doWork();
			System.out.println("------------------------------");
			testService.set();
		};
	}



}
