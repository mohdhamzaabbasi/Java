public class Bank
{
	static int nooftransaction=0;
	public void withdraw(double amount)
	{
		nooftransaction++;
		System.out.println(amount+" Rs. debited via atm.");
	}
	public void withdraw(double amount, String upiid)
	{
		nooftransaction++;
		System.out.println(amount+" Rs. debited via UPI : "+upiid);
	}
	public void withdraw(double amount, long accountno)
	{
		nooftransaction++;
		System.out.println(amount+" Rs. debited via accno. : "+accountno);
	}
	public void deposit(double amount)
	{
		nooftransaction++;
		System.out.println(amount+" Rs. credited via atm.");
	}
	public void deposit(double amount, String upiid)
	{
		nooftransaction++;
		System.out.println(amount+" Rs. credited via UPI : "+upiid);
	}
	public void deposit(double amount, long accountno)
	{
		nooftransaction++;
		System.out.println(amount+" Rs. credited via accno. : "+accountno);
	}
	public static void total()
	{
		System.out.println("Total number of transaction : "+nooftransaction);
	}
	public static void main(String[]args)
	{
		Bank upi=new Bank();
		Bank atm=new Bank();
		Bank netbanking=new Bank();
		upi.withdraw(540,"7905011947@ibl");
		upi.deposit(720,"9336865880@pz");
		atm.withdraw(500);
		atm.deposit(700);
		netbanking.withdraw(1000,723862323);
		netbanking.deposit(500,983274283);
		total();
	}
}
