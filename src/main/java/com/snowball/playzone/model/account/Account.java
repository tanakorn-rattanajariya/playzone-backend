package com.snowball.playzone.model.account;

import org.springframework.data.annotation.Id;

import com.snowball.playzone.model.BaseModel;

import lombok.Getter;

@Getter
public class Account extends BaseModel{

	@Id
	private Id id;
	private String firstName;
	private String lastName;
	private String displayName;
	private String username;
	private String password;
	public Id getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getUsername() {
		return username;
	}
	public String getDisplayName() {
		return displayName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	
}
