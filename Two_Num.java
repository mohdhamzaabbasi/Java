import java.util.*;
public class Two_Num
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number : ");
		double a=sc.nextInt();
		System.out.println("Enter second Number : ");
		int b=sc.nextInt();
		try 
		{
			System.out.println("Division : "+(a/b));	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero error!");	
		}
	}
}