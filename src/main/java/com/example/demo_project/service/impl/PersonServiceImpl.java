package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public Person getPersonInfo(String id) {
		Person person = new Person();
		person.setId(id);
		person.setName("AAA");
		person.setAge(20);
		person.setCity("BBB");
		return person;
		
	}
//
//	public void getPersonInfo(Person per) {
//		
//	}
}
