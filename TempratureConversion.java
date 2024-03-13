import java.util.Scanner;
class TempratureConverter extends Exception
{
	public TempratureConverter(String x)
	{
		super(x);
	}
}
public class TempratureConversion
{
	public static void main(String[]args) throws TempratureConverter
	{
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		try
		{
			convert(temp);
		}
		catch (PasswordValidator e)
		{
			e.printStackTrace();
		}
	}
	static void convert(int pass)throws PasswordValidator
	{
		if(pass.length()<8)t
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