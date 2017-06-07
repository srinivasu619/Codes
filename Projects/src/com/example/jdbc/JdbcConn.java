package com.example.jdbc;
import java.sql.*;
import java.util.Scanner;
public class JdbcConn {
	public static void main(String args[]) throws SQLException
	{
		Connection myconn=null;
		PreparedStatement myStm2=null;
		ResultSet myRs=null;
		try
		{
			myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/amusers?useSSL=true","root","tiger");
			//myStm2=myconn.prepareStatement("select * from userinf where Username=?");
			//String update="insert into employee"+"(emp_name,street,city)"+"values('SRINIVASU','Q','F')";
			//String update="update employee set city='G' where emp_name='SRINIVASU'";
			//String update="delete from employee where emp_name='SRINIVASU'";
			//int a= mystm.executeUpdate(update);
			//System.out.println(a);
			//System.out.println("COMPLETE");
			/*myStm2=myconn.prepareStatement("select * from employees where salary > ? and department =?");
			myStm2.setDouble(1, 25000);
			myStm2.setString(2, "HR");*/
			Statement mystm=myconn.createStatement();
			String a="insert into userinf(Username,passU,emailid,course) values('inivasu619','159soma357','C','D')";
			mystm.executeQuery(a);
			//display(myRs);
		}
		catch(Exception e)
		{
			
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStm2 != null) {
				myStm2.close();
			}
			
			if (myconn != null) {
				myconn.close();
			}
		}


	}
	private static void display(ResultSet myRs) throws SQLException {
		while (myRs.next()) {
			String lastName = myRs.getString("Username");
			String firstName = myRs.getString("passU");
			String emailid=myRs.getString("emailid");
			String course = myRs.getString("course");
			
			System.out.printf("%s, %s, %s, %s\n", lastName, firstName,emailid,course);
		}
	}


}