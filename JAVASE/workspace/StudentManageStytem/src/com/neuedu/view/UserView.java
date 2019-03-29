package com.neuedu.view;



import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserView {
	void register() throws RegisterException;
	void login() throws LoginException;
}
