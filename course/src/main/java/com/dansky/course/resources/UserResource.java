package com.dansky.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dansky.course.entities.User;
import com.dansky.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List <User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

//	@PostMapping
//	public User createPerson(@RequestBody User person) {
//		return service.save(person);
//	}

//	@PutMapping
//	public User updatePerson(@RequestBody User person) {
//		return service.save(person);
//	}
//
//	@DeleteMapping("/{id}")
//	public String deletePerson (@PathVariable Integer id) {
//		service.delete(id);
//		return id + " deletado ";
//	}
}
