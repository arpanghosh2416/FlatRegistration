package com.flat.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flat.app.entity.Owner;
import com.flat.app.exception.FlatNotFoundException;
import com.flat.app.exception.FlatRegisteredException;
import com.flat.app.exception.NoOwnersFoundException;
import com.flat.app.service.OwnerService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/owner")
public class OwnerController {

	@Autowired
	private OwnerService ownerService;

	@GetMapping("/")
	public String test() {
		String msg = "Owner-REST-API server is running";
		return msg;
	}

	@GetMapping("/get-all-owners")
	public ResponseEntity<?> getAllOwners() throws NoOwnersFoundException {
		List<Owner> owners = ownerService.getAllOwners();
		return ResponseEntity.ok(owners);
	}

	@PostMapping("/register-flat")
	public ResponseEntity<?> createOwner(@RequestBody @Valid Owner owner)
			throws FlatRegisteredException, FlatNotFoundException {
		Owner _owner = ownerService.createOwner(owner);
		return ResponseEntity.status(201).body(_owner);
	}

}
