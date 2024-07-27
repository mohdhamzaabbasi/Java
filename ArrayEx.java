public class ArrayEx 
{
	public static void main(String[]args)
	{
		int array3[]= {1,2,3,4,5};
		System.out.print("Original array elements--> ");
		for(int i=0;i<array3.length;i++)
		{
			System.out.print(array3[i]+"\t");
		}
		System.out.print("\nReversed array elements--> ");
		for(int i=array3.length-1;i>=0;i--)
		{
			System.out.print(array3[i]+"\t");
		}
		System.out.print("\nAlternate array elements--> ");
		for(int i=array3.length-1;i>=0;i--)
		{
			if(i%2==0)
			{
				System.out.print(array3[i]+"\t");
			}
		}
		System.out.print("\nAll even numbers--> ");
		for(int i=0;i<101;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"\t");
			}
		}
		int max=array3[0];
		for(int i=0;i<array3.length;i++)
		{
			if(array3[i]>max)
			{
				max=array3[i];
			}  
		}
		System.out.print("\nLargest array elements--> "+max);
	}
}
