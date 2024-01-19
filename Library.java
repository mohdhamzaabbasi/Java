public class Library
{
    String book;
    String author;
    String library;
    Library()
    {
        book="";
        author="";
        library="";
    }
    void details()
    {
        System.out.println(this.book);
        System.out.println(this.author);
        System.out.println(this.library);
    }
    public static void main(String[]args)
    {
        Library ob=new Library();
        Library ob2=new Library();
        ob.book="Harry Potter";
        ob.author="J K Rowling";
        ob.library="SIT";
        ob2.book="Malgudi Days";
        ob2.author="Abdul";
        ob2.library="SSBS";
        ob.details();
        ob2.details();
    }
}