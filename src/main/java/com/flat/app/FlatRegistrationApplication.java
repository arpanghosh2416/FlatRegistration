package com.flat.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flat.app.entity.Flat;
import com.flat.app.repository.FlatRepository;
import com.flat.app.repository.OwnerRepository;

@SpringBootApplication
public class FlatRegistrationApplication {

	@Autowired
	private FlatRepository flatRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(FlatRegistrationApplication.class, args);
	}

	@PostConstruct
	public void dummy() {
		Flat flat1 = new Flat(null, 101L, false, null);
		Flat flat2 = new Flat(null, 101L, false, null);
		Flat flat3 = new Flat(null, 101L, false, null);

		flatRepository.save(flat1);
		flatRepository.save(flat2);
		flatRepository.save(flat3);
		System.out.println("--- 3 Flats are saved ---");

//		Owner owner1 = new Owner(null, "A", "a@gmail.com", 12345L, null);
//		Owner owner2 = new Owner(null, "B", "b@gmail.com", 67890L, null);
//
//		ownerRepository.save(owner1);
//		ownerRepository.save(owner2);
//		System.out.println("--- 2 owners are saved ---");
//
//		flat1.setOwner(owner1);
//		flat1.setLivingStatus(true);
//		flat2.setOwner(owner2);
//		flat2.setLivingStatus(true);
//		flat3.setOwner(owner2);
//		flat3.setLivingStatus(true);
//
//		flatRepository.save(flat1);
//		flatRepository.save(flat2);
//		flatRepository.save(flat3);
//		System.out.println("--- Relationship mapped ---");
	}

}
