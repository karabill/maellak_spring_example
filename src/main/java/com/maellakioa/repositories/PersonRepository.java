package com.maellakioa.repositories;

import java.util.List;

import com.maellakioa.models.Person;

public interface PersonRepository {
	public List<Person> getPersons();
	public void createPerson(Person p);
}
