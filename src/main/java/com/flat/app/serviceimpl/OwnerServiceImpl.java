package com.flat.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flat.app.entity.Owner;
import com.flat.app.repository.OwnerRepository;
import com.flat.app.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public List<Owner> getAllOwners() {
		List<Owner> owners = ownerRepository.findAll();
		return owners;
	}

	@Override
	public Owner createOwner(Owner owner) {
		Owner _owner = ownerRepository.save(owner);
		return _owner;
	}

	@Override
	public Owner getOwnerById(Long ownerId) {
		Owner owner = ownerRepository.findById(ownerId).orElse(null);
		return owner;
	}

	@Override
	public Owner getOwnerByOwnerEmail(String ownerEmail) {
		Owner owner = ownerRepository.findByOwnerEmail(ownerEmail).orElse(null);
		return owner;
	}

	@Override
	public List<Owner> getOwnerByOwnerName(String ownerName) {
		List<Owner> owners = ownerRepository.findByOwnerName(ownerName);
		return owners;
	}

}
