package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.propertyDao;
import com.example.demo.models.property;

@Service
public class propertyService {
	
	@Autowired
	private propertyDao repos;
	//method to add a new property
	public property addProperty(property pr) {
		return repos.save(pr);
	}
	//method to return all properties information
	public Collection<property> getAllProperties(){
		return repos.findAll();
	}
	//method to delete a property
	public void deleteProperty(property pr) {
		repos.delete(pr);
	}
	//method to save a property's information
	public void saveProperty(property pr) {
		repos.save(pr);
	}
	//method to return all properties information
	public Collection<property> getProperty(){
		return repos.findAll();
	}

}
