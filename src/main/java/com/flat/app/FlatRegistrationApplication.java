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

	public static void main(String[] args) {
		SpringApplication.run(FlatRegistrationApplication.class, args);
	}

	@PostConstruct
	public void dummy() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 6; j++) {
				Flat flat = Flat.builder().storeyNumber((long) i).livingStatus(false).build();
				flatRepository.save(flat);
			}
		}
		System.out.println("--- 24 Flats are saved ---");
	}

}
