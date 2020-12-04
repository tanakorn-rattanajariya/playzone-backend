package com.snowball.playzone.model;

import org.springframework.data.repository.Repository;

import com.google.common.base.Optional;

public interface BaseRepository<T,ID> extends Repository<T,ID> {

	<S extends T> S save(S entity);
	Optional<T> findById(ID primaryKey);
	Iterable<T> findAll();
	long count();   
	void delete(T entity); 
	boolean existsById(ID primaryKey);
}
