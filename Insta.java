public class Insta
{
    String user;
    int post;
    int comment;
    Insta()
    {
        user="";
        post=0;
        comment=0;
    }
    void details()
    {
        System.out.println(this.user);
        System.out.println(this.post);
        System.out.println(this.comment);
    }
    public static void main(String[]args)
    {
        Insta ob=new Insta();
        Insta ob2=new Insta();
        ob.user="J K Rowling";
        ob.post=6;
        ob.comment=423;
        ob2.user="MRADUL";
        ob2.post=8;
        ob2.comment=33;
        ob.details();
        ob2.details();
    }
}

