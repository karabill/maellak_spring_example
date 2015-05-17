package com.maellakioa.models;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "age_summary", types = Person.class)
public interface PersonAgeProjection {
	public byte getAge();
}
