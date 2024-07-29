public class SortCheck 
{
    public static boolean check(int num[],int i)
    {
        if(i==num.length-1)
        {
            return true;
        }
        if(num[i]>num[i+1])
        {
            return false;
        }
        return check(num,i+1);
    }
    public static void main(String[]args)
    {
        int num[]={1,2,3,4,56,6,77,78};
        int num2[]={1,2,3,4,5,6,7};
        System.out.println(check(num,0));
        System.out.println(check(num2,0));
    }    
}
