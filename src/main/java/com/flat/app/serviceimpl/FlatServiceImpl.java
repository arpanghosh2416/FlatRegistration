package com.flat.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flat.app.entity.Flat;
import com.flat.app.repository.FlatRepository;
import com.flat.app.service.FlatService;

@Service
public class FlatServiceImpl implements FlatService {

	@Autowired
	private FlatRepository flatRepository;

	@Override
	public List<Flat> getAllFlats() {
		List<Flat> flats = flatRepository.findAll();
		return flats;
	}

	@Override
	public Flat createFlat(Flat flat) {
		Flat _flat = flatRepository.save(flat);
		return _flat;
	}

	@Override
	public Flat getFlatById(Long flatId) {
		Flat flat = flatRepository.findById(flatId).orElse(null);
		return flat;
	}

	@Override
	public List<Flat> getFlatByStoreyNumber(Long storeyNumber) {
		List<Flat> flats = flatRepository.findByStoreyNumber(storeyNumber);
		return flats;
	}

}
