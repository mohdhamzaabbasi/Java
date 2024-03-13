public class assign_3 
{
	int a;
    public assign_3()
    {
    	System.out.println("Default constructor called.");
    }
    public assign_3(int value) 
    {
        this.a = value;
        System.out.println("Parameterized constructor called with value: " + value);
    }
    public assign_3(assign_3 original) 
    {
        this.a = original.a;
        System.out.println("Copy constructor called with value: " + this.a);
    }
    public static void main(String[] args)
    {
    	assign_3 obj = new assign_3();
    	System.out.println("Value of A : "+obj.a);
    	assign_3 obj2 = new assign_3(2);
    	assign_3 obj3 = new assign_3(obj2);
    }
}
