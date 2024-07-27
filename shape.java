public class shape
{
	public void calculate(int n)
	{
		System.out.println("Area of square = "+(n*n));
	}
	public void calculate(int n, int x)
	{
		System.out.println("Area of rectangle = "+(n*x));
	}
	public void calculate(double n)
	{
		System.out.println("Area of circle = "+(3.14*n*n));
	}
	public static void main(String[]args)
	{
		shape square=new shape();
		shape rectangle=new shape();
		shape circle=new shape();
		square.calculate(4);
		rectangle.calculate(4, 6);
		circle.calculate(4.2);
	}
}
