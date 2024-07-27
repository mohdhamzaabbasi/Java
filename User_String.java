import java.util.Scanner;
public class User_String
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String a=sc.next();
		try 
		{
			int b=Integer.parseInt(a);	
			System.out.println(b);	
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception");	
		}
	}
}