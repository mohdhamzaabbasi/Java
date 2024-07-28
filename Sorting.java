import java.util.*;
public class Sorting
{
    public static void bubbleSort(int num[])
    {
        for(int i=0;i<num.length-1;i++)
        {
            for(int j=0;j<num.length-i-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    num[j]=num[j]+num[j+1];
                    num[j+1]=num[j]-num[j+1];
                    num[j]=num[j]-num[j+1];
                }
            }
        }
    }
    public static void selectionSort(int num[])
    {
        for(int i=0;i<num.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<num.length;j++)
            {
                if(num[min]>num[j])
                {
                    min=j;
                }
            }
            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
    }
    public static void insertionSort(int num[])
    {
        for(int i=1;i<num.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(num[j]<num[j-1])
                {
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
    public static void countSort(int num[],int max,int min)
    {
        int arr[]=new int[max-min+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<num.length;i++)
        {
            int curr=num[i];
            int ind=curr-min;
            arr[ind]=arr[ind]+1;
        }
        int id=0;
        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]!=0)
            {
                num[id]=i+min;
                arr[i]=arr[i]-1;
                id++;
            }
        }
    }
    public static void main(String[]args)
    {
        int num[]={4,2,0,6,3,2,5};
        bubbleSort(num);
        System.out.print("Bubble Sort--> ");
        for(int i=0;i<num.length;i++)
        {
            System.out.print("\t"+num[i]);
        }
        System.out.println();
        int num2[]={7,6,5,3,2,1};
        selectionSort(num2);
        System.out.print("Selection Sort--> ");
        for(int i=0;i<num2.length;i++)
        {
            System.out.print("\t"+num2[i]);
        }
        System.out.println();
        int num3[]={7,6,8,5,3,2,1};
        insertionSort(num3);
        System.out.print("Insertion Sort--> ");
        for(int i=0;i<num3.length;i++)
        {
            System.out.print("\t"+num3[i]);
        }
        System.out.println();
        Integer num4[]={7,6,8,5,3,2,1};
        Arrays.sort(num4,Collections.reverseOrder());
        System.out.print("In-built Sort--> ");
        for(int i=0;i<num4.length;i++)
        {
            System.out.print("\t"+num4[i]);
        }
        System.out.println();
        int num5[]={7,9,7,5,8,5,3,2,1};
        countSort(num5,9,1);
        System.out.print("Count Sort--> ");
        for(int i=0;i<num5.length;i++)
        {
            System.out.print("\t"+num5[i]);
        }
    }
}
