package com.wedding.daos;

import com.wedding.models.Login;

public interface LoginDao {
	public Login validate(String loginId,String pass);

}