//Creates and keeps track of SentenceParser info

import java.util.*;
import java.io.*;

public class SentenceParser 
{
	private String sentence;
	private String[] wordArray;

	public SentenceParser()
	{
		wordArray = new String[10];
	}

	public void readFile() throws IOException

	{
		File file = new File("Lab8_2A.txt");
		Scanner scan = new Scanner(file);

		while(scan.hasNext())
		{
			sentence=scan.nextLine();
			System.out.println(sentence);

			parseIt();
			printEvens();
			blankArray();
		}

		scan.close();
	}

	public void parseIt()
	{
		int i = 0;

		StringTokenizer sT = new StringTokenizer(sentence," ");
		while (sT.hasMoreTokens())
		{
			wordArray[i]=sT.nextToken();
			i++;
		}
	}

	public void printEvens()
	{
		for(int j=0;j<wordArray.length;j++)
		{
			if(j%2==0 && wordArray[j]!=null)
			{
				System.out.print(wordArray[j]+" ");
			}
		}
		System.out.print("\n");
	}

	public void blankArray()
	{
		for(int k=0;k<wordArray.length;k++)
		{
			wordArray[k]="";
		}
	}
}
	