package org.zenika.com.sample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zenika.com.sample.model.User;
import org.zenika.com.sample.services.UserServices;

@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	private UserServices services;

	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody final User user) {
		return ResponseEntity.ok(this.services.createUser(user));
	}

	@PutMapping("/user/")
	public ResponseEntity<User> updateUser(@PathVariable final String id, @RequestBody final User user) {
		return ResponseEntity.ok().body(this.services.updateUserById(id, user));
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable final String id) {
		return ResponseEntity.ok().body(this.services.getUserById(id));
	}

	@DeleteMapping("/user/{id}")
	public HttpStatus deleteUser(@PathVariable final String id) {
		this.services.deleteUserById(id);
		return HttpStatus.OK;
	}
}
