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
import com.flat.app.entity.Owner;
import com.flat.app.repository.FlatRepository;
import com.flat.app.repository.OwnerRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/owner")
public class OwnerController {

	@Autowired
	private FlatRepository flatRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	@GetMapping("/")
	public String test() {
		return "Server is running";
	}

	@PostMapping("/owner")
	public ResponseEntity<?> createOwner(@RequestBody Owner owner) {
		List<Flat> flats = owner.getFlats();
		owner.setFlats(null);

		Owner _owner = ownerRepository.save(owner);
		flats.forEach(e -> e.setOwner(_owner));
		flatRepository.saveAll(flats);

		return ResponseEntity.status(201).body(_owner);
	}

	@GetMapping("/owners")
	public ResponseEntity<?> getAllOwners() {
		return ResponseEntity.ok(ownerRepository.findAll());
	}

}
