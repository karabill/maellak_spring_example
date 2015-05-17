package com.maellakioa.services;

import java.util.List;

import com.maellakioa.models.Person;

public interface PersonService {
	public List<Person> getPersons();
	public void createPerson(Person p);
}
