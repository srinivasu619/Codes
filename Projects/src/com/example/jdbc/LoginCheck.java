package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class LoginCheck {
	String username;
	char[] password;
	public LoginCheck() {
		// TODO Auto-generated constructor stub
	}
	public LoginCheck(String username,char[] password) {
		this.username=username;
		this.password=password;
	}
	public boolean dataConn() 
	{
		Connection UserCon;
		try {
			UserCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/amusers?useSSL=false","root","tiger");
			Statement mystm=UserCon.createStatement();
			String checkStm="select * from userinf where Username="+"'"+username+"'";
			ResultSet myRs=mystm.executeQuery(checkStm);
			if(myRs==null)
			{
				return false;
			}
			else
			{
				while(myRs.next())
				{
					String pass=myRs.getString("passU");
					char passArr[]=pass.toCharArray();
					if(Arrays.equals(password, passArr))
					{
						return true;
					}
				}
			}
			UserCon.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return false;
	}
}
