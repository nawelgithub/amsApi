package com.sid.amsapi.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import com.sid.amsapi.entities.User;
import com.sid.amsapi.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthRestController {
	@Autowired
	private UserService userService;

	/*
	 * @GetMapping(path = "/basicauth") public AuthenticationBean basicauth() {
	 * return new AuthenticationBean("You are authenticated"); }
	 */

	@GetMapping(path = "/basicauth")
	public User basicauth() {
		// return "User nawel : Role Admin";
		// return new User("nawelbennawel@gmail.com","1234");
		// return "Success";
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		return user;
	}

}
