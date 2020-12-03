package com.snowball.playzone.authentication;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
	
	@RequestMapping(value="/login",method= RequestMethod.POST,consumes = "application/json", produces = "application/json" )
	public void login(@RequestBody String username,@RequestBody String password) {
		AuthenticationService.getToken();
	}
}
