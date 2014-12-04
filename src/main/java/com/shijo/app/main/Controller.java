package com.shijo.app.main;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shijo.app.main.dataobject.User;

@RestController
@RequestMapping(value ="/app/test")
public class Controller {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String getDetails(){
		return "Welcome to spring boot!!";
	}
	
	@RequestMapping(value="/",method = RequestMethod.POST)
	public String postDetails(@RequestBody User user){
		return user.toString();
	}
	
}
