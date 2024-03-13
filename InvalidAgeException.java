import java.util.*;
public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String x)
	{
		super(x);
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
	}
}
class InvalidAGeExceptionHandler
{
	public static void main(String[]args) throws InvalidAgeException
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try
		{
			age(age);
		}
		catch (InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}
	static void age(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("O bachche kal aana.");
		}
		else
		{
			System.out.println("Welcome");
		}
	}
}