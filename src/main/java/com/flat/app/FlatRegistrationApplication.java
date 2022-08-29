package com.flat.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flat.app.entity.Flat;
import com.flat.app.entity.User;
import com.flat.app.repository.FlatRepository;
import com.flat.app.service.UserService;

@SpringBootApplication
public class FlatRegistrationApplication {

	@Autowired
	private UserService userService;

	@Autowired
	private FlatRepository flatRepository;

	public static void main(String[] args) {
		SpringApplication.run(FlatRegistrationApplication.class, args);
	}

	@PostConstruct
	public void dummy() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 6; j++) {
				Flat flat = Flat.builder().storeyNumber((long) i).price(240000L).livingStatus(false).soldOut(false)
						.build();
				flatRepository.save(flat);
			}
		}
		System.out.println("--- 24 Flats are saved ---");

		User user = User.builder().username("admin123").password("Admin@123").userRole("ADMIN").build();
		userService.registerUser(user);
		System.out.println("--- Admin Created ---");
	}

}
