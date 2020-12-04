package com.snowball.playzone.model.account;

import org.springframework.data.annotation.Id;

import com.snowball.playzone.model.BaseService;

public class Account extends BaseService{

	@Id
	private Id ID;
	private String FirstName;
	private String LastName;
	private String DisplayName;
	private String Username;
	private String Password;
}
