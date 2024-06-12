// Program Name: LAB24C
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB24C 
{
	public static void main(String[] args) throws IOException
	{
		MyStack<Drinks> obj1=new MyStack<>();

		File f1 = new File("Lab24C.txt");
		Scanner s1 = new Scanner(f1);

		while(s1.hasNext())
		{
			Drinks drink=new Drinks(s1.next(), s1.next(), s1.nextInt());
			obj1.push(drink);
		}
		s1.close();

		System.out.println(obj1);

		System.out.println("****Remove drink****");
		System.out.println(obj1.pop());

		System.out.println("****Remove drink****");
		System.out.println(obj1.pop());

		System.out.println("New List\n\n"+obj1);
	}
}




