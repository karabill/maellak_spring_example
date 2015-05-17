package com.maellakioa.controllers;

import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maellakioa.models.Person;
import com.maellakioa.services.PersonService;

@Controller
@RequestMapping("mypersons")
public class PersonController {
	@Autowired
	private PersonService personService;

	// http://localhost:8080/mypersons/list
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Map<String, Object> model) {
		model.put("persons", personService.getPersons());
		return "list";
	}

	// http://localhost:8080/mypersons/listApi
	@RequestMapping(value = "/listApi", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public String listApi(Model model) throws JSONException {
		JSONArray menuArray = new JSONArray();
		for (Person p : personService.getPersons()) {
			JSONObject menuJSON = new JSONObject();
			menuJSON.put("name", p.getName());
			menuJSON.put("age", p.getAge());
			menuArray.put(menuJSON);
		}
		return menuArray.toString();
	}
}
