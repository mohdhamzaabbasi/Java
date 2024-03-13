abstract class Shape
{
	static int noofshape=0;
	Shape()
	{
		noofshape++;
	}
	abstract void draw();
	static void displayInfo()
	{
		System.out.println("Total number of shape : "+noofshape);
	}
	void display()
	{
		System.out.println("This is a shape.");
	}
}
class Square extends Shape
{

	@Override
	void draw()
	{
		System.out.println("Drawing Square.");		
	}
	
}
class Circle extends Shape
{

	@Override
	void draw()
	{
		System.out.println("Drawing Circle.");		
	}
	
}
public class Abstract
{
	public static void main(String[]args)
	{
		Square sq =new Square();
		Circle cir =new Circle();
		Shape sq2 =new Square();
		Shape cir2 =new Circle();
		
		sq.draw();
		sq.display();
		cir.draw();
		cir.display();
		sq2.draw();
		sq2.display();
		cir2.draw();
		cir2.display();
		Shape.displayInfo();
	}
	
}
