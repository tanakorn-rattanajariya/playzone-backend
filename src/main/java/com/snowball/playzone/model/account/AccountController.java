package com.snowball.playzone.model.account;

import com.snowball.playzone.model.BaseController;

public class AccountController extends BaseController<AccountService> {

	public void test() {
		service.findByUsername("user");
	}
}
