class Dogfun
{
	private String name;
	private int age;
	public int getage()
	{
		return age;
	}                                                                   
	public void setage(int age)                                
	{
		this.age=age;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)                                
	{
		this.name=name;
	}
	public void bark()
	{
		System.out.println(this.name+" is barking.");
	}
}
public class Dog
{
	public static void main(String[]args)
	{
		Dogfun dog=new Dogfun();
		System.out.println("Before getter and setter.");
		System.out.println(dog.getname());
		System.out.println(dog.getage());
		dog.setage(18);
		dog.setname("Tommy");
		System.out.println("After getter and setter.");
		System.out.println(dog.getname());
		System.out.println(dog.getage());
	} 
}
