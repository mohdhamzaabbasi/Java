class Operand
{
	private int op1;
	private int op2;
	public int getop1()
	{
		return op1;
	}                                                                   
	public void setop1(int op1)                                
	{
		this.op1=op1;
	}
	public int getop2()
	{
		return op2;
	}                                                                   
	public void setop2(int op2)                                
	{
		this.op2=op2;
	}
	public void add()
	{
		System.out.println("Addition = "+(this.op1+this.op2));
	}
	public void sub()
	{
		System.out.println("Difference = "+(this.op1-this.op2));
	}
	public void mul()
	{
		System.out.println("Product = "+(this.op1*this.op2));
	}
	public void div()
	{
		System.out.println("Questiont = "+(this.op1/this.op2));
	}
}
public class Calculate
{
	public static void main(String[]args)
	{
		Operand ob=new Operand();
		ob.setop1(30);
		ob.setop2(10);
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
	}
}