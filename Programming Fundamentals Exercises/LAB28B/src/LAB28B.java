// Program Name: LAB28B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB28B {

	public static void main(String[] args) throws IOException
	{
		int x=0;
		MyStack<Tent> obj1=new MyStack<>();

		File f1 = new File("Lab28txt.txt");
		Scanner s1 = new Scanner(f1);

		//read file and put into stack
		while(s1.hasNext())
		{
			Tent t=new Tent(s1.nextInt(),s1.nextInt(),s1.nextLine());
			obj1.push(t);
		}
		s1.close();

		//print stack until empty
		while(obj1.isEmpty()==false)
		{
			System.out.println(obj1.pop());
		}
	}

}
