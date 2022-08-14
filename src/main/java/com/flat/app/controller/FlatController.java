package com.flat.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flat.app.entity.Flat;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/flat")
public class FlatController {

	@GetMapping("/")
	public String test() {
		String msg = "Flat-REST-API server is running";
		return msg;
	}

	@GetMapping("/get-all-flats")
	public ResponseEntity<?> getAllFlats() {
		return null;
	}

	@PostMapping("/create-flat")
	public ResponseEntity<?> createFlat(@RequestBody Flat flat) {
		return null;
	}

}
