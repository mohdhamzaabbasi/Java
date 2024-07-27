import java.util.*;
public class FirstCap 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		if(inp.charAt(0)>='a'&&inp.charAt(0)<='z')
		{
			char x=(char) (inp.charAt(0)-32);
			String n=x+"";
			inp=n+inp.substring(1);
		}
		for(int i=0;i<inp.length()-1;i++)
		{
			char ch1=inp.charAt(i);
			if(ch1==' ')
			{
				char ch=inp.charAt(i+1);
				if(ch>='a'&&ch<='z')
				{
					ch-=32;
					String n=ch+"";
					inp=inp.substring(0,i+1)+n+inp.substring(i+2);
				}
			}
		}
		System.out.println(inp);
	}
}
