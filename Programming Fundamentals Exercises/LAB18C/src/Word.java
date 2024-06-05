//Creates and keeps track of Word info

import java.util.*;
import java.io.*;

public class Word 
{
	private static String word1;
	private static String word2;
	private static int nR;

	public static void getWords()
	{
		Scanner keyboard=new Scanner(System.in);

		nR=0; 

		System.out.println("Please enter your first word");
		word1=keyboard.nextLine();
		word1=word1.trim();
		System.out.println("Please enter your second word");
		word2=keyboard.nextLine();
		word2=word2.trim();

		System.out.println("\nWord 1 before editing is "+word1);
		System.out.println("\nWord 2 before editing is "+word2);
		
		editWord();
	}

	public static void editWord()
	{
		if(word1.indexOf(word2)!=-1)
		{	
			word1=word1.replaceFirst(word2,"");
	
			nR++;
	
			System.out.println("\nWord 1 after "+nR+" revisions is: "+word1);

			editWord();
		}
		else
		{
			System.out.print("\nThe final word after "+nR+" revisions is: "+word1);
		}		
	}

}
