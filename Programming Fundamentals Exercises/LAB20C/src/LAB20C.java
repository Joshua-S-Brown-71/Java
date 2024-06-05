// Program Name: LAB20C
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB20C 
{
	public static void main(String[] args) throws IOException 
	{
		String c;
		int o;
		Queue <Orders> sheet=new LinkedList<>();


		File f = new File("Lab20C.txt");
		Scanner s = new Scanner(f);
		while(s.hasNext())
		{
			c=s.nextLine();
			o=s.nextInt();
			s.nextLine();

			Orders order = new Orders(c,o);
			sheet.add(order);
		}
		s.close();
		System.out.println("\nThe queue is:\n "+sheet);
		m1(45,sheet);
		System.out.println("\nThe current queue is: "+sheet+"\n");

	}
	public static void m1(int inOW, Queue <Orders> inQ)
	{
		int sumO=0;
		System.out.println("\nOrders Processed");
		while((sumO+inQ.peek().getW())<=inOW)
		{
			System.out.println(inQ.peek());
			sumO+=inQ.remove().getW();
		}
		System.out.println("\nThe number of widgets left over is: "+(inOW-sumO));
		System.out.println("\nThe remaining queue: "+inQ);
		

	}
}
