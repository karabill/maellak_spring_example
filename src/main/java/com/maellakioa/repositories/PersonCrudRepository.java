package com.maellakioa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.maellakioa.models.Person;

@RepositoryRestResource
public interface PersonCrudRepository extends CrudRepository<Person, Long> {
	
	public List<Person> findByAge(@Param("age") byte age);

	@Query(value = "SELECT * FROM persons WHERE age=:age1 OR age=:age2", nativeQuery = true)
    public List<Person> find2Age(@Param("age1") byte age1, @Param("age2") byte age2);
}
