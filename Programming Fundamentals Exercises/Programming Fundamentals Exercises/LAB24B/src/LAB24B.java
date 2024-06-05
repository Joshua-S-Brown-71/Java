// Program Name: LAB24A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB24B 
{

	public static void main(String[] args) throws IOException 
	{
		MyQueue<Cars> obj1=new MyQueue<>();

		File f1 = new File("Lab24B.txt");
		Scanner s1 = new Scanner(f1);

		while(s1.hasNext())
		{
			Cars car=new Cars(s1.next(), s1.next(), s1.nextInt());
			obj1.enqueue(car);
		}
		s1.close();

		System.out.println(obj1);

		System.out.println("****Remove Car****");
		System.out.println(obj1.dequeue());

		System.out.println("****Remove Car****");
		System.out.println(obj1.dequeue());

		System.out.println("****Remove Car****");
		System.out.println(obj1.dequeue());

		System.out.println("New List\n\n"+obj1);
	}
}





