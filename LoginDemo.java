import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class LoginDemo
{	
	public static void main(String[]args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/csb","root","Hamzalfs@7086");
			System.out.println("Connection Established.");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from login");
			System.out.print("Enter Username : ");
			String user=sc.next();
			System.out.print("Enter Password : ");
			String pass=sc.next();
			while(rs.next())
			{
				if(user.equals(rs.getString(1)) && pass.equals(rs.getString(2)))
				{
					System.out.println("Login Successful.");
					return;
				}
				System.out.println(rs.getString(1)+rs.getString(2));
			}
			System.out.println("Login Unsuccessful.");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}
}
