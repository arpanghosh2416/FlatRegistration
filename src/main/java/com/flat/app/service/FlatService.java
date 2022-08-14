package com.flat.app.service;

import java.util.List;

import com.flat.app.entity.Flat;

public interface FlatService {

	public List<Flat> getAllFlats();

	public Flat createFlat(Flat flat);

	public Flat getFlatById(Long flatId);

	public List<Flat> getFlatByStoreyNumber(Long storeyNumber);

}
