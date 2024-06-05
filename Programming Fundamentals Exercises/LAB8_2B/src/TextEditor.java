//Creates and keeps track of TextEditor info

import java.util.*;
import java.io.*;

public class TextEditor 
{
	private String message;
	private char[] cArray; 

	public TextEditor(String inString)
	{
		message=inString;
	}

	public void replaceWord()
	{
		String ow, nw;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the old word\n");
		ow=keyboard.next().trim();
		
		System.out.println("Please enter the new word\n");
		nw=keyboard.next().trim();

		message=message.replaceAll(ow,nw);

		cArray=message.toCharArray();		
	}

	public void editAndPrint()
	{
		System.out.println(message+"\n");

		for(int i=0;i<cArray.length;i++)
		{
			if(i==0 && Character.isLetter(cArray[i]))
			{
				cArray[i]=Character.toUpperCase(cArray[i]);
					System.out.print(cArray[i]);
			}
			else if(cArray[i]=='.' && i!=(cArray.length-1))
			{
				
				if(Character.isLetter(cArray[i+1]))
				{
					cArray[i+1]=Character.toUpperCase(cArray[i+1]);
				}

				System.out.print(cArray[i]+" ");
			}
			else if(cArray[i]=='%' && i!=(cArray.length-1))
			{
				System.out.print("\n\n");

				if(Character.isLetter(cArray[i+1]))
				{
					cArray[i+1]=Character.toUpperCase(cArray[i+1]);
				}
			}
			else 
			{
				System.out.print(cArray[i]);
			}

		}
	}

}
