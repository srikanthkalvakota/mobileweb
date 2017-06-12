package com.jpmc.uber4jp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.jpmc.uber4jp.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.jpmc.uber4jp"})
public class Uber4jpApplication {

	public static void main(String[] args) {
		SpringApplication.run(Uber4jpApplication.class, args);
	}
}
