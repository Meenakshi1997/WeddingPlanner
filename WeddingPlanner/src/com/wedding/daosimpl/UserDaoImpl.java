package com.wedding.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import com.wedding.daos.UserDao;
import com.wedding.models.User;
import com.wedding.utility.ConnectionProvider;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean registerUser(User userObj) {
		try {
		Connection conn=ConnectionProvider.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into User_Tab values(?,?,?,?,?,?)");
		ps.setString(1,userObj.getEmail());
		ps.setString(2,userObj.getPassword());
		ps.setString(3,userObj.getFirstName());
		ps.setString(4,userObj.getLastName());
		ps.setString(5,userObj.getGender());

		/*Converting java.util.Date into java.sql.Date*/
		Date dateOfBirth=userObj.getDateOfBirth();
		long l=dateOfBirth.getTime();
		java.sql.Date dob=new java.sql.Date(l);
		ps.setDate(6, dob);

		int i=ps.executeUpdate();
		if(i!=0){
			return true;
		}
		else {
			return false;
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User getUser(String email) {
		try {
			//Connection conn=ConnectionProvider.getConn();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public boolean updateUser(User userObj) {
		try {
			//Connection conn=ConnectionProvider.getConn();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean changePassword(String email, String newPassword) {
		try {
		//	Connection conn=ConnectionProvider.getConn();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return false;
	}
}
