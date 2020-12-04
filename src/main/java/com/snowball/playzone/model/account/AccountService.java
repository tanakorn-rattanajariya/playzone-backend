package com.snowball.playzone.model.account;

import com.snowball.playzone.model.BaseService;

public class AccountService extends BaseService<AccountRepository> {

	public void  testService() {
		repository.findAll();
	}
}
