package com.hospital.is.dao;

import java.util.Map;

public interface DAO<T> {
	
	T create(T t);

	Map<Integer ,T> getAll();

	T getById(Integer id);

	T update(T t, Integer id);

	boolean delete(Integer id);
}
