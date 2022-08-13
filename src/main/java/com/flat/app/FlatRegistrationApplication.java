package com.flat.app;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flat.app.entity.Flat;
import com.flat.app.entity.Owner;
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

		List<Flat> flats1 = new ArrayList<Flat>();
		List<Flat> flats2 = new ArrayList<Flat>();

		flats1.add(flat1);
		flats2.add(flat2);
		flats2.add(flat3);

		Owner owner1 = new Owner(null, "A", "aa@email", 12345L, flats1);
		Owner owner2 = new Owner(null, "B", "bb@email", 67891L, flats2);

		owner1.getFlats().get(0).setLivingStatus(true);
		owner2.getFlats().get(0).setLivingStatus(true);
		owner2.getFlats().get(1).setLivingStatus(true);

		ownerRepository.save(owner1);
		ownerRepository.save(owner2);

	}
}
