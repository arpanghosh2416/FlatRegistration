package com.flat.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flat.app.entity.Flat;
import com.flat.app.service.FlatService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/flat")
public class FlatController {

	@Autowired
	private FlatService flatService;

	@GetMapping("/")
	public String test() {
		String msg = "Flat-REST-API server is running";
		return msg;
	}

	@GetMapping("/get-all-flats")
	public ResponseEntity<?> getAllFlats() {
		List<Flat> flats = flatService.getAllFlats();
		return ResponseEntity.ok(flats);
	}

	@PostMapping("/create-flat")
	public ResponseEntity<?> createFlat(@RequestBody Flat flat) {
		Flat _flat = flatService.createFlat(flat);
		return ResponseEntity.status(201).body(_flat);
	}

}
