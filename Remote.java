abstract class Remot
{
	abstract void on();
	abstract void off();
}
abstract class ACRemot extends Remot
{
	abstract void inTemp();
	abstract void deTemp();
}
class Carremot extends ACRemot
{

	@Override
	void inTemp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deTemp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void off() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Remote
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
