import java.util.*;
public class Java_8
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int search=sc.nextInt();
        int i=0;
        int j=3;
        while(i<4&&j<4)
        {
            if(search>arr[i][j])
            {
                i++;
            }
            else if(search<arr[i][j])
            {
                j--;
            }
            else
            {
                System.out.println("Element Found at ("+i+","+j+")");
                return;
            }
        }
        System.out.println("Element not found.");
    }
}