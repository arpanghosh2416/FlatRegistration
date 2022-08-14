package com.flat.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flat.app.entity.Flat;
import com.flat.app.repository.FlatRepository;

@SpringBootApplication
public class FlatRegistrationApplication {

	@Autowired
	private FlatRepository flatRepository;

//	@Autowired
//	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(FlatRegistrationApplication.class, args);
	}

	@PostConstruct
	public void dummy() {
		Flat flat1 = Flat.builder().storeyNumber(101L).livingStatus(false).build();
		Flat flat2 = Flat.builder().storeyNumber(101L).livingStatus(false).build();
		Flat flat3 = Flat.builder().storeyNumber(101L).livingStatus(false).build();

		flatRepository.save(flat1);
		flatRepository.save(flat2);
		flatRepository.save(flat3);
		System.out.println("--- 3 Flats are saved ---");

//		List<Flat> flats1 = new ArrayList<Flat>();
//		List<Flat> flats2 = new ArrayList<Flat>();
//		flats1.add(flat1);
//		flats2.add(flat2);
//		flats2.add(flat3);
//
//		Owner owner1 = Owner.builder().ownerName("aaa").ownerEmail("a@gmail.com").phoneNumber("1234567890").build();
//		Owner owner2 = Owner.builder().ownerName("bbb").ownerEmail("b@gmail.com").phoneNumber("1234567891").build();
//
//		ownerRepository.save(owner1);
//		ownerRepository.save(owner2);
//
//		flats1.forEach(e -> {
//			e.setOwner(owner1);
//			e.setLivingStatus(true);
//		});
//
//		flats2.forEach(e -> {
//			e.setOwner(owner2);
//			e.setLivingStatus(true);
//		});
//
//		flatRepository.saveAll(flats1);
//		flatRepository.saveAll(flats2);
//		System.out.println("--- 2 owners are saved ---");
	}

}
