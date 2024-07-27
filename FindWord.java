import java.util.Scanner;
public class FindWord 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		System.out.println("Enter the word?");
		String word=sc.next();
		int c=0;
		while(true)
		{
			int s=inp.indexOf(' ');
			if(s==-1)
			{
				break;
			}
			String curr=inp.substring(0,s);
			if(curr.equalsIgnoreCase(word))
			{
				c++;
			}
			inp=inp.substring(s+1);
		}
		if(word.equalsIgnoreCase(inp))
		{
			c++;
		}
		System.out.println("Total occurance : "+c);
	}
}
