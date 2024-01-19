public class Flexi_assign
{
    String name="Redmi";
    double price=15000;
    int stock=21;
    String category="Phone";
    public static void main(String[]args)
    {
        Flexi_assign ob=new Flexi_assign();
        Flexi_assign ob2=new Flexi_assign();
        ob.check();
        ob2.name="Earphone";
        ob2.price=13000;
        ob2.category="accessory";
        ob2.stock=10;
        ob2.check();
    } 
    void addstock()
    {
        stock++;
    }
    void delstock()
    {
        stock--;
    }
    void check()
    {
        System.out.println(name);
        System.out.println(price);
        System.out.println(stock);
        System.out.println("fir".compareTo("firee"));
    }
}