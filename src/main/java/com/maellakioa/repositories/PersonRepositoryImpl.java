package com.maellakioa.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maellakioa.models.Person;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")

	@Override
	public List<Person> getPersons() {
		return getSession().createQuery("from Person").list();
	}

	@Override
	public void createPerson(Person p) {
		getSession().save(p);
	}

}
