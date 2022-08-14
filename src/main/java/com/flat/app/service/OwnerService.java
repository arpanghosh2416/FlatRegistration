package com.flat.app.service;

import java.util.List;

import com.flat.app.entity.Owner;
import com.flat.app.exception.FlatNotFoundException;
import com.flat.app.exception.FlatRegisteredException;
import com.flat.app.exception.NoOwnersFoundException;

public interface OwnerService {

	public List<Owner> getAllOwners() throws NoOwnersFoundException;

	public Owner createOwner(Owner owner) throws FlatRegisteredException, FlatNotFoundException;

	public Owner getOwnerById(Long ownerId);

	public Owner getOwnerByOwnerEmail(String ownerEmail);

	public List<Owner> getOwnerByOwnerName(String ownerName);

}
