import java.util.Scanner;
class PasswordValidator extends Exception
{
	public PasswordValidator(String x)
	{
		super(x);
	}
}
public class PasswordValidation
{
	public static void main(String[]args) throws PasswordValidator
	{
		Scanner sc=new Scanner(System.in);
		String pass=sc.next();
		try
		{
			check(pass);
		}
		catch (PasswordValidator e)
		{
			e.printStackTrace();
		}
	}
	static void check(String pass)throws PasswordValidator
	{
		if(pass.length()<8)
		{
			throw new PasswordValidator("Too Short");
		}
		else if(pass.length()>20)
		{
			throw new PasswordValidator("Too Long");
		}
		else
		{
			System.out.println("Chalega!!");
		}
	}
}