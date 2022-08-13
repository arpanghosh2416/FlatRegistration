package com.flat.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "flat_owner")
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "owner_id")
	private Long ownerId;

	@Column(name = "owner_name")
	private String ownerName;

	@Column(name = "owner_email")
	private String ownerEmail;

	@Column(name = "phone_number")
	private Long phoneNumber;

}
