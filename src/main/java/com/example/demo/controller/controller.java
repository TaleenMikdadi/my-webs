package com.example.demo.controller;

import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.property;
import com.example.demo.models.user;
import com.example.demo.service.propertyService;
import com.example.demo.service.userService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class controller {
	
	@Autowired
	private userService serv;
	
	@GetMapping("/admin/login/{email}/{password}")
	public @ResponseBody user signIn(@PathVariable(name="email") String email , @PathVariable(name="password") String password)
	{
		return serv.login(email, password);
		
	}
	
	//add user then return good when added
	@PostMapping(value="admin/addUser", consumes ="application/json",produces ="application/json")
	public user addUsers(@RequestBody user u) {
		System.out.println(u);
		return serv.addUser(u);
		//return "good";
	}
	
	@GetMapping("/admin/getAll")
	public Collection<user> getAllUsers()
	{
		return serv.getAllUsers();
	}
	
	@Autowired
	private propertyService prop;
	//add property then return good when added
	@PostMapping(value="admin/addProperty", consumes ="application/json",produces ="application/json")
	public String addProperty(@RequestBody property pr) {
		prop.addProperty(pr);
		return "good";
	}
	//delete property then return good when added
		@PostMapping("admin/deleteProperty")
		public String deleteProperty(@RequestBody property pr) {
			prop.deleteProperty(pr);
			return "good";
		}
		@GetMapping("/admin/getAllP")
		public Collection<property> getAllProperties()
		{
			return prop.getAllProperties();
		}
}
