package testJDBC;
import java.sql.*;
public class Registeration {
	private String username,password,course,emailId,sub1,sub2,sub3,sub4,sub5;
	private int ID;
	public Registeration(String username,String password,String course,String emailId) {
		this.username=username;
		this.password=password;
		this.emailId=emailId;
		this.course=course;
		}
	public Registeration(String sub1,String sub2,String sub3,String sub4,String sub5)
	{
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;
	}
	private Connection registerConn=null;
	 void dataInsert()
	{	System.out.println("INsert");
		try
		{ 
			registerConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/amusers?useSSL=false","root","tiger");
			String cmd="insert into userinf(Username,passU,emailid,course) values(?,?,?,?)";
			PreparedStatement ps=registerConn.prepareStatement(cmd);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, emailId);
			ps.setString(4, course);
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				registerConn.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	 int getIDnumber()
	 {
		 try
		 {
			 registerConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/amusers?useSSL=false","root","tiger");
			 Statement getIDstm=registerConn.createStatement();
			 ResultSet res=getIDstm.executeQuery("select id from userinf where Username= '"+username+"'");
			 ID=res.getInt(1);
		 }
		 catch (Exception e) {
			// TODO: handle exception
		}
		 finally {
			try {
				registerConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ID; 
	 }
	 void subjectInsert()
	 {
		 try
		 {
			 registerConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/amusers?useSSL=false","root","tiger");
			 PreparedStatement stm=registerConn.prepareStatement("insert into subjects(UserID,subject1,subject2,subject3,subject4,subject5) values(?,?,?,?,?)");
			 stm.setInt(1, ID);
			 stm.setString(2,sub1);
			 stm.setString(3,sub2);
			 stm.setString(4,sub3);
			 stm.setString(5,sub4);
			 stm.setString(6,sub5);
			 stm.executeUpdate();
		 }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
		 finally {
			try {
				registerConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 }
	 public static void main(String args[])
	 {
		 Registeration r=new Registeration("Srinivasu357", "159357258", "B.tech", "Q");
//		 r.dataInsert();
		 r.getIDnumber();
	 }
}
