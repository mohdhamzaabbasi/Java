import java.util.*;
class Student
{
	int id;
	String name;
	char grade;
}
class StudentDatabase
{
	ArrayList<Integer> id = new ArrayList<Integer>();
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<Character> grade = new ArrayList<Character>();
	void add(Student ob)
	{
		id.add(ob.id);
		name.add(ob.name);
		grade.add(ob.grade);
	}
	void remove(Student ob)
	{
		id.remove(id.indexOf(ob.id));
		name.remove(id.indexOf(ob.name));
		grade.remove(id.indexOf(ob.grade));
	}
	void display()
	{
		System.out.println("ID\tName\tGrade");
		for(int i=0;i<id.size();i++)
		{
			System.out.println(id.get(i)+"\t"+name.get(i)+"\t"+grade.get(i));
		}
	}
}
public class Admin
{
	public static void main(String[]args)
	{
		int choice=1;
		Scanner sc=new Scanner(System.in);
		while(choice!=5)
		{
			System.out.println("Menu!");
			System.out.println("1 : Add Student");
			System.out.println("2 : Remove Student");
			System.out.println("3 : Display Student");
			System.out.println("4 : EXIT");
			System.out.println("Enter your choice :");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Student ob=new Student();
				ob.id=sc.nextInt();
				ob.name=sc.nextLine();
				ob.grade=sc.next().charAt(0);
				StudentDatabase ob2=new StudentDatabase();
				ob2.add(ob);
				break;
			case 2:
				Student ob5=new Student();
				ob5.id=sc.nextInt();
				ob5.name=sc.nextLine();
				ob5.grade=sc.next().charAt(0);
				StudentDatabase ob3=new StudentDatabase();
				ob3.remove(ob5);
				break;
			case 3:
				StudentDatabase ob7=new StudentDatabase();
				ob7.display();
				break;
			case 4:
				System.out.println("Thankyou!");
				return;
			default:
				System.out.println("Wrong Choice!");
				break;
			}
		}
	}
}
