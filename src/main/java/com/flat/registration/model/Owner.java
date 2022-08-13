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
@Table(name="Flat_Owner")
public class Owner{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="OwnerID", length=10)
	private String ownerId;
	
	private FlatNumber number;
	
	private Storey storey;
	
	@Column(name="Phone_Number", length=10)
	private long phnno;

}
