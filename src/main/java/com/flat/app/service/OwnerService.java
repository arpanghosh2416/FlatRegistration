package com.flat.app.service;

import java.util.List;

import com.flat.app.entity.Owner;

public interface OwnerService {

	public List<Owner> getAllOwners();

	public Owner createOwner(Owner owner);

	public Owner getOwnerById(Long ownerId);

	public Owner getOwnerByOwnerEmail(String ownerEmail);

	public List<Owner> getOwnerByOwnerName(String ownerName);

}
