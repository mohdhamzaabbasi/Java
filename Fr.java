class BankAccount 
{
    private static int total = 0;
    private String acc;
    private String name;
    private double bal;

    public BankAccount(String acc, String name, double bal) 
    {
        this.acc = acc;
        this.name = name;
        this.bal = bal;
        total++;
    }
    public String getAcc() 
    {
        return acc;
    }

    public void setAcc(String acc) 
    {
        this.acc = acc;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBal()
    {
        return bal;
    }

    public void setBal(double bal) 
    {
        this.bal = bal;
    }

    public void depositMoney(double amount) 
    {
    	bal += amount;
    	System.out.println("Deposited " + amount + " into account " + acc + ". New balance: " + bal);
    }

    public void withdrawMoney(double amount) 
    {
            bal -= amount;
            System.out.println("Withdrawn " + amount + " from account " + acc + ". New balance: " + bal);
    }

    public static void disp() 
    {
        System.out.println("Total accounts: " + total);
    }
}
public class Fr
{
    public static void main(String[] args)
    {
        BankAccount ob1 = new BankAccount("22070122123", "Mayank", 100000);
        BankAccount ob2 = new BankAccount("22070122128", "Mardul", 50089);
        ob1.depositMoney(50.0);
        ob2.withdrawMoney(200);
        ob1.depositMoney(200);
        ob2.withdrawMoney(5000);
    }
}

