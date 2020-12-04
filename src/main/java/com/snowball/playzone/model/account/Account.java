package com.snowball.playzone.model.account;

import org.springframework.data.annotation.Id;

import com.snowball.playzone.model.BaseModel;

public class Account extends BaseModel{

	@Id
	private Id ID;
	private String FirstName;
	private String LastName;
	private String DisplayName;
	private String Username;
	private String Password;
}
