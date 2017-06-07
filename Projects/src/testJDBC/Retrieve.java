package testJDBC;
import java.sql.*;
public class Retrieve {
	private Connection retrieveCon=null;
	public Retrieve() {
		
	}
	boolean loginCheck(String username,char[] pass)
	{
		try {
			retrieveCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/amusers?useSSL=false","root","tiger");
			Statement stm=retrieveCon.createStatement();
			String query="select Username,passU from userinf where Username='"+username+"'";
			ResultSet res=stm.executeQuery(query);
			if(res.getString(1).equals(username))
			{
				for(int i=0;i<res.getString(2).length();i++)
				{
					if(pass[i]!=(res.getString(2)).charAt(i))
					{
						return false;
					}
				}
			}
			else
			{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
