package com.udemy.spring.springselenium;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.javafaker.Faker;
import com.udemy.spring.springselenium.config.Assignment1;

@SpringBootTest
class SpringSeleniumApplicationTests {

	/*
	 * /*
	 * 
	 * @Autowired
	 * private User user;
	 * 
	 * 
	 * @Value("PATH")
	 * private String path;
	 *
	 * // enviroment variable path from machine
	 * 
	 * @Value("${path}")
	 * private String path;
	 * 
	 * // from aplication.properties | spring can consider the commas as a list
	 * 
	 * @Value("${fruits}")
	 * private List<String> fruits;
	 * 
	 * @Value("${timeout}")
	 * private String timeout;
	 * 
	 * // : -> defect value
	 * 
	 * @Value("${TEST_URL:https://www.google.com}")
	 * private String url;
	 * 
	 * @Autowired
	 * private Faker faker;
	 * 
	 * /* @Autowired
	 * private Television tv; *
	 * 
	 * @Autowired
	 * private Assignment1 list;
	 * 
	 * @Test
	 * void contextLoads() {
	 * /*
	 * Address address = new Address();
	 * Salary salary = new Salary();
	 * User user = new User(address, salary);
	 * user.printDetails();
	 *
	 * 
	 * System.out.println(this.faker.yoda().quote());
	 * System.out.println(this.list.list());
	 * 
	 * }
	 */
}
