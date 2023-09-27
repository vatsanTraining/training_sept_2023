package com.example.ifaces;

import java.util.List;

public interface CrudRepository<T> {

	boolean add(T t);
	List<T> findAll();
	
}
