import java.util.*;
public class Vec
{
	public static void main(String[]args)
	{
		Vector<Integer> listOfWords = new Vector<Integer>();
		System.out.println(listOfWords.size());
		listOfWords.add(1);
		listOfWords.add(3);
		listOfWords.add(4); 
		listOfWords.add(5);
		listOfWords.add(6);
		listOfWords.add(7);
		listOfWords.add(8);
		listOfWords.add(9);
		System.out.println(listOfWords.size());
		for(int word:listOfWords)
		{
			System.out.print(word);
		}
	}
}
