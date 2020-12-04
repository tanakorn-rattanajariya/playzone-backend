package com.snowball.playzone.authentication;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
	
	@RequestMapping(value="/login",method= RequestMethod.POST,consumes = "application/json", produces = "application/json" )
	public String login(@RequestBody String username,@RequestBody String password) {
		try {
			String token =AuthenticationService.getToken(username,password);
			return token;
		} catch (Exception e) {
			return String.valueOf(e);
		}
	}
}
