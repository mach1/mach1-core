package com.ttu.mach1.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable> {

	PK create(T t);

	T find(PK id);

	void update(T t);

	void delete(T t);

	List<T> findAll();
}
