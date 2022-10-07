package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

@SpringBootTest
class DemoProjectApplicationTests {

	@Autowired
	private PersonService personservice;

	@Test
	public void contextLoads() {
		Person per = personservice.getPersonInfo("YYY");
		System.out.println(per.getId());
	}

}
