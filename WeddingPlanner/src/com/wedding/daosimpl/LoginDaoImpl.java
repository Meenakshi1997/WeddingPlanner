package com.wedding.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.wedding.daos.LoginDao;
import com.wedding.models.Login;
import com.wedding.utility.ConnectionProvider;

public class LoginDaoImpl implements LoginDao {
	@Override
	public Login validate(String loginId, String pass) {
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from Login_Tab where loginId=? and password=?");
			ps.setString(1,loginId);
			ps.setString(2,pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String s1=rs.getString(1);
				String s2=rs.getString(2);
				String s3=rs.getString(3);
				
				Login obj=new Login();
				obj.setLoginId(s1);
				obj.setPassword(s2);
				obj.setRole(s3);
				return obj;
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}


}
