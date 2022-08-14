package com.flat.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flat.app.entity.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

	public List<Owner> findByOrderByOwnerNameAsc();

	public List<Owner> findByOrderByOwnerEmailAsc();

	public List<Owner> findByOwnerName(String ownerName);

	public Optional<Owner> findByOwnerEmail(String ownerEmail);

	public Optional<Owner> findByPhoneNumber(Long phoneNumber);

}
