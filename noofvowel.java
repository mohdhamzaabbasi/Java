import java.util.*;
public class noofvowel
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		int count=0;
		for(int i=0;i<inp.length();i++)
		{
			if("AEIOUaeiou".indexOf(inp.charAt(i))!=-1)
			{
				count++;
			}
		}
		System.out.println("Number of vowels : "+count);
	}
}
