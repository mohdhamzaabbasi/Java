import java.util.*;
public class Library
{
	public static void main(String[]args)
	{
		ArrayList<String> listOfWords = new ArrayList<String>();
		System.out.println(listOfWords.size());
		listOfWords.add("Hello ");
		listOfWords.add("world");
		listOfWords.add("I ");
		listOfWords.add("am ");
		listOfWords.add("learning ");
		listOfWords.add("java");
		listOfWords.add(".");
		listOfWords.add(2,", ");
		System.out.println(listOfWords.size());
		for(String word:listOfWords)
		{
			System.out.print(word);
		}
	}
}