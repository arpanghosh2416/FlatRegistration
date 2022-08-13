package com.flat.registration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Flat_Storey")
public class Storey {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Flat_Storey", length=4)
	private int storeyNumber;
	
	@Column(name="FlatNumber", length=8)
	private FlatNumber flatNumber;

}
