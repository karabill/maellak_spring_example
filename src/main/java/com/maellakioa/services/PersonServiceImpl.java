package com.maellakioa.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maellakioa.models.Person;
import com.maellakioa.repositories.PersonRepository;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> getPersons() {
		return personRepository.getPersons();
	}

	@Override
	public void createPerson(Person p) {
		personRepository.createPerson(p);
	}

}
