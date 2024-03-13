import java.util.HashSet;
import java.util.Scanner;
public class UniqueCharacters 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        HashSet<Character>unique=new HashSet<>();
        for(char c:input.toCharArray()) 
        {
            if(!unique.contains(c)) 
            {
                unique.add(c);
            }
        }
        System.out.println("Unique characters from the input string:");
        for(char c:unique) 
        {
            System.out.print(c+" ");
        }
    }
}