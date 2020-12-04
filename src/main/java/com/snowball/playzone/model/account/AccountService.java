package com.snowball.playzone.model.account;

import com.snowball.playzone.model.BaseService;

public class AccountService extends BaseService<AccountRepository> {

	public static AccountService instance;
	public static AccountService getInstance() {
		if(instance==null)instance = new AccountService();
		return instance;
	}
	
	
	public Account findByUsername(String username) {
		return repository.findByUsername(username);
	}
}
