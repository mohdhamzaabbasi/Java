public class SMS
{
    String student;
    String course;
    String teacher;
    SMS()
    {
        student="";
        course="";
        teacher="";
    }
    void details()
    {
        System.out.println(this.student);
        System.out.println(this.course);
        System.out.println(this.teacher);
    }
    public static void main(String[]args)
    {
        SMS ob=new SMS();
        SMS ob2=new SMS();
        ob.student="Mayank";
        ob.course="EM-II";
        ob.teacher="B S Veena";
        ob.student="Mradul";
        ob.course="EM-III";
        ob.teacher="Ram Kishun Lodhi";
        ob.details();
        ob2.details();
    }
}

