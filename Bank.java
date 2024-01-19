public class Bank
{
    int account;
    String customer;
    int transaction;
    Bank()
    {
        account=0;
        customer="";
        transaction=0;
    }
    void details()
    {
        System.out.println(this.account);
        System.out.println(this.customer);
        System.out.println(this.transaction);
    }
    public static void main(String[]args)
    {
        Bank ob=new Bank();
        Bank ob2=new Bank();
        ob.account=434545334;
        ob.customer="J K Rowling";
        ob.transaction=4353423;
        ob.account=3434224;
        ob.customer="MRADUL";
        ob.transaction=394873;
        ob.details();
        ob2.details();
    }
}

