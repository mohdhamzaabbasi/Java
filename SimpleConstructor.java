
public class SimpleConstructor
{
	int a;
	public SimpleConstructor()
	{
		System.out.println("Default Constructor called.");
		a=10;
	}
	public SimpleConstructor(int a)
	{
		System.out.println("Parameterized Constructor called.")
		this.a=a;
	}
}
