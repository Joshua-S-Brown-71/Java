// Program Name: LAB8_2B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;
public class LAB8_2B 
{
	public static void main(String[] args)throws IOException
	{
		String input="";

		File file = new File("Lab8_2B.txt");
		Scanner scan = new Scanner(file);

		while(scan.hasNext())
		{
			input=scan.nextLine();
		}

		TextEditor object = new TextEditor(input);

		object.replaceWord();
		object.editAndPrint();

		scan.close();
	}

}
