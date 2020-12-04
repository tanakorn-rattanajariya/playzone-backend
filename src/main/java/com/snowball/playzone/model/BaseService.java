package com.snowball.playzone.model;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<R> {

	@Autowired
	protected R repository;
	
}
