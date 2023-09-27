package com.training.ifaces;

import java.io.IOException;

import com.training.model.Medicine;

public interface CrudRepository {

	boolean add(Medicine obj) ;
	Medicine[] findAll();
	Medicine findById(int id);
}


