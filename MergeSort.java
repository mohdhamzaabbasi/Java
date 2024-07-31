import java.util.*;
public class MergeSort
{
    public static void mergeSort(int num[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(num, si, mid);
        mergeSort(num, mid+1, ei);
        merge(num,si,mid,ei);
    }
    public static void merge(int num[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei)
        {
            if(num[i]<num[j])
            {
                temp[k++]=num[i];
                i++;
            }
            else
            {
                temp[k++]=num[j];
                j++;
            }
        }
        while(i<=mid)
        {
            temp[k++]=num[i];
            i++;
        }
        while(j<=ei)
        {
            temp[k++]=num[j];
            j++;
        }
        for(int f=0;f<temp.length;f++)
        {
            num[f+si]=temp[f];
        }
    }
    public static void main(String[]args)
    {
        int num[]={4,3,5,6,3,6,7,4,3};
        mergeSort(num, 0, 8);
        for(int f=0;f<num.length;f++)
        {
            System.out.print("\t"+num[f]);
        }
    }
}