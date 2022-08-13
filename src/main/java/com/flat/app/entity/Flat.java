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
@Table(name = "flat")
public class Flat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "flat_id")
	private Long flatId;

	@Column(name = "storey_number")
	private Long storeyNumber;

	@Column(name = "living_status")
	private Boolean livingStatus;

}
