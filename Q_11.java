<<<<<<< HEAD
class BankAccount 
{
    private static int totalAccounts = 0;
    private String accountNumber;
    private String name;
    private double balance;
    public BankAccount(String accountNumber, String name, double balance) 
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }
    public String getAccountNumber() 
    {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public void depositMoney(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber + ". New balance: " + balance);
        }
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdrawMoney(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account " + accountNumber + ". New balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
    public static void displayTotalAccounts() 
    {
        System.out.println("Total accounts: " + totalAccounts);
    }
}
public class Q_11 
{
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount("123456", "Alice", 1000);
        BankAccount account2 = new BankAccount("654321", "Bob", 500);

        BankAccount.displayTotalAccounts();

        account1.depositMoney(500);
        account2.withdrawMoney(200);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        account1.withdrawMoney(2000);
        account2.depositMoney(-100);

        BankAccount.displayTotalAccounts();
    }
}
=======
class BankAccount 
{
    private static int totalAccounts = 0;
    private String accountNumber;
    private String name;
    private double balance;
    public BankAccount(String accountNumber, String name, double balance) 
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }
    public String getAccountNumber() 
    {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public void depositMoney(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber + ". New balance: " + balance);
        }
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdrawMoney(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account " + accountNumber + ". New balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
    public static void displayTotalAccounts() 
    {
        System.out.println("Total accounts: " + totalAccounts);
    }
}
public class Q_11 
{
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount("123456", "Alice", 1000);
        BankAccount account2 = new BankAccount("654321", "Bob", 500);

        BankAccount.displayTotalAccounts();

        account1.depositMoney(500);
        account2.withdrawMoney(200);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        account1.withdrawMoney(2000);
        account2.depositMoney(-100);

        BankAccount.displayTotalAccounts();
    }
}
>>>>>>> 50bae3c8696f2a9421448ffe1de31a6ca0e4c221
