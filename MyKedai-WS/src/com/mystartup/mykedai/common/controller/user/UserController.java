package com.mystartup.mykedai.common.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mystartup.mykedai.common.bean.core.ResponseI;
import com.mystartup.mykedai.common.service.user.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping(
			value="/login/{username}/{password}",
			method=RequestMethod.GET,
			produces="application/json")
	public ResponseI login(@PathVariable String username, @PathVariable String password){
		return service.login(username, password);
	}
	
	@RequestMapping(
			value="/insert/{username}/{password}",
			method=RequestMethod.GET,
			produces="application/json")
	public ResponseI insert(@PathVariable String username, @PathVariable String password){
		return service.insert(username, password);
	}

	@RequestMapping(
			value="/update/{publicid}/{username}/{password}",
			method=RequestMethod.GET,
			produces="application/json")
	public ResponseI update(@PathVariable int publicid, @PathVariable String username, @PathVariable String password){
		return service.update(publicid, username, password);
	}

	@RequestMapping(
			value="/delete/{publicid}",
			method=RequestMethod.GET,
			produces="application/json")
	public ResponseI delete(@PathVariable int publicid){
		return service.deleteByPublicId(publicid,0);
	}

	@RequestMapping(
			value="/select/{publicid}",
			method=RequestMethod.GET,
			produces="application/json")
	public ResponseI select(@PathVariable int publicid){
		return service.selectByPublicId(publicid);
	}
}
