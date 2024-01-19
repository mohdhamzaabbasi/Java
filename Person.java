public class Person
{
    String name;
    int age;
    String gender;
    Person()
    {
        name="";
        age=0;
        gender="";
    }
    void details()
    {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
    public static void main(String[]args)
    {
        Person ob=new Person();
        Person ob2=new Person();
        ob.name="Sushi";
        ob.age=14;
        ob.gender="female";
        ob2.name="Sushank";
        ob2.age=13;
        ob2.gender="male";
        ob.details();
        ob2.details();
    }
}