package com.vipul.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.vipul.test.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.vipul.test"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class UserRegistrationStarter {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationStarter.class, args);
	}
}
