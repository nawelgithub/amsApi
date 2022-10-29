package com.sid.amsapi.controllers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import com.sid.amsapi.entities.Role;
import com.sid.amsapi.entities.User;
import com.sid.amsapi.repositories.RoleRepository;
import com.sid.amsapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class RegistrationController {
	@Autowired
	private UserService userService;

	@Autowired
	private RoleRepository roleRepository;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public User createNewUser(@RequestBody User user) {

		// User userExists = userService.findUserByEmail(user.getEmail());

		// Role userRole = roleRepository.findByRole("ADMIN");
		// Role userRole2 =

		// Set<Role> role_user = user.getRoles();
		// user.setRoles(new HashSet<Role>(role_user));

		Role userRole = roleRepository.findByRole(user.getTemp());
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));

		// si on veut donner le role User à tout le monde
		// user.setRoles(new HashSet<Role>(Arrays.asList(new Role("User"))));

		userService.saveUser(user);

		return user;
	}

}
