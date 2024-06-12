// Program Name: LAB27C
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;
import java.lang.*;

public class LAB27C 
{
	public static void main(String[] args) throws IOException 
	{
		int hashN;
		String name;
		

		ArrayList<String>[] arr = new ArrayList[36];
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=new ArrayList<>();
		}


		File f1 = new File("Lab27C.txt");
		Scanner s1 = new Scanner(f1);

		while(s1.hasNext())
		{
			name=s1.next();
			
			hashN=hash(name);
			arr[hashN].add(name);
		}
		s1.close();

		for(int j=0;j<arr.length;j++)
		{
			System.out.print("Index: "+j+"  ");
			if(arr[j].size()>0)
			{
				System.out.println(arr[j]+"\n");
			}
			else 
			{
				System.out.println("empty[]\n");
			}
							
		}	
	}

	public static int hash(String inString)
	{
		char c;
		c=Character.toLowerCase(inString.charAt(0));
		return(inString.length()+(c-'a'+1));
	}
}
