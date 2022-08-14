package com.flat.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flat.app.entity.Owner;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/owner")
public class OwnerController {

	@GetMapping("/")
	public String test() {
		String msg = "Owner-REST-API server is running";
		return msg;
	}

	@GetMapping("/get-all-owners")
	public ResponseEntity<?> getAllOwners() {
		return null;
	}

	@PostMapping("/register-flat")
	public ResponseEntity<?> createOwner(@RequestBody Owner owner) {
		return null;
	}

}
