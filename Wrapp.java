public class Wrapp 
{
	public static void main(String[]args)
	{
		int a=10;
		Integer j=a;
		System.out.println("Auto Boxing-->"+j);
		int x=j;
		System.out.println("Auto Unboxing-->"+j);
		int y=j.intValue();
		System.out.println("Forced Unboxing-->"+y);
		float z=j.floatValue();
		System.out.println("Forced Unboxing-->"+z);
		double k=j.doubleValue();
		System.out.println("Forced Unboxing-->"+k);
	}
	
}
