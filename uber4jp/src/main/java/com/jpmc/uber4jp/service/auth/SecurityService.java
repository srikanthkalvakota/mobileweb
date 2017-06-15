package com.jpmc.uber4jp.service.auth;

public interface SecurityService {

	String findLoggedInUsername();

	void autologin(String username, String password);

}
