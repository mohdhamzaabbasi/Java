public class Shop
{
    String product;
    String customer;
    int orderid;
    Shop()
    {
        product="";
        customer="";
        orderid=0;
    }
    void details()
    {
        System.out.println(this.product);
        System.out.println(this.customer);
        System.out.println(this.orderid);
    }
    public static void main(String[]args)
    {
        Shop ob=new Shop();
        Shop ob2=new Shop();
        ob.product="Facewash";
        ob.customer="Maynk";
        ob.orderid=4;
        ob.product="Goodday";
        ob.customer="Mradul";
        ob.orderid=56;
        ob.details();
        ob2.details();
    }
}

