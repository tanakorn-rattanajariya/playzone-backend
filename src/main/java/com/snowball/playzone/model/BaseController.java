package com.snowball.playzone.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public abstract class BaseController<S> {

	@Autowired
	protected S service;
	
}
