package com.flat.registration.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlatNumber {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Flat_ID", length=8)
	private int flatNumber; 
	
	@Column(name="Owner_Ref")
	private Owner owner;

}
