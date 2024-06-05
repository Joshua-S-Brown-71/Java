// Program Name: LAB21B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB21B 
{
	public static void main(String[] args) throws IOException 
	{
		String input;
		char map;
		int value;
		File f1 = new File("Lab21B.txt");
		Scanner s1 = new Scanner(f1);
		LinkedHashMap<Character, Integer> lhm1=new LinkedHashMap<>();

		while(s1.hasNext())
		{
			input="";
			value=0;
			input=s1.nextLine();

			System.out.print(input+" ");

			if(lhm1.containsKey(input.charAt(0)))
			{
				value=lhm1.get(input.charAt(0));
				lhm1.put(input.charAt(0),(value+1));
			}
			else
			{
				lhm1.put(input.charAt(0),1);

			}
		}
		s1.close();
		System.out.println("\n");
		System.out.println(lhm1+"\n");
	}

}
