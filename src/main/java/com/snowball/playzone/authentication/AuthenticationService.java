package com.snowball.playzone.authentication;


import java.sql.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;

import com.snowball.playzone.model.account.Account;
import com.snowball.playzone.model.account.AccountService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

public class AuthenticationService {

	@Autowired
	private static AccountService accountService = AccountService.getInstance();
	
	public static String getToken(String username,String password) throws Exception {
		Account account =accountService.findByUsername(username);
		if(account!=null && password.equals(account.getPassword())) {
			SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(String.valueOf(account.getId())));
			String jws = Jwts.builder().claim("username", username).claim("password", password).setExpiration(new Date(System.currentTimeMillis())).signWith(key).compact();
			return jws;
		}
		throw new Exception("Cannot Find Any Account");
	}
}
