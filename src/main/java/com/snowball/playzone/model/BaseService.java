package com.snowball.playzone.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseService<R> {
	
	@Autowired
	@Qualifier("repository")
	protected R repository;
	
}
