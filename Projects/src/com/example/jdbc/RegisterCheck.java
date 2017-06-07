package com.example.jdbc;

import java.sql.*;
public class RegisterCheck {
	String username,password,course,emailId;
	public RegisterCheck(String username,String password,String course,String emailId) {
		this.username=username;
		this.password=password;
		this.emailId=emailId;
		this.course=course;
		
	}
	public void dataInsert()
	{
		Connection InsertConn=null;
		try {
			InsertConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/amusers?useSSL=false","root","tiger");
	
			String cmd="insert into userinf(Username,passU,emailid,course) values(?,?,?,?)";
			PreparedStatement ps=InsertConn.prepareStatement(cmd);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, emailId);
			ps.setString(4, course);
			ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				InsertConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
