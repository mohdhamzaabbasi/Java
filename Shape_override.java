class Circle
{		
	public void calculate(int n)
	{
		System.out.println("Area : "+(3.14*n*n));
	}
}
class Square extends Circle
{
	public void calculate(int n)
	{
		System.out.println("Area : "+( n*n));
	}
}
public class Shape_override
{
	public static void main(String[]args)
	{
		Circle ob=new Circle();
		Square ob2=new Square();
		Circle ob3=new Square();
		ob.calculate(4);
		ob2.calculate(4);
		ob3.calculate(4);		
	}
}