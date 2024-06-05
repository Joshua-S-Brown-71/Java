// Program Name: LAB20B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB20B 
{

	public static void main(String[] args) throws IOException 
	{
		

		String t, a;
		int n;
		Stack <Book> bookStack=new Stack<>();

		File f = new File("Lab20B.txt");
		Scanner s = new Scanner(f);

		while(s.hasNext())
		{
			t=s.nextLine();
			a=s.nextLine();
			n=s.nextInt();
			s.nextLine();

			Book book = new Book(t,a,n);
			bookStack.push(book);
		}
		s.close();
		System.out.println(bookStack+"\n");
		m1(bookStack);
		System.out.println("The current stack is now: \n\n"+bookStack+"\n");

	}
	public static void m1(Stack <Book> inBookStack)
	{
		int tPR=0;
		System.out.println("\nThe size of the Stack is: "+inBookStack.size());
		System.out.println("\nBooks Read in Challenge");

		while((!inBookStack.isEmpty())&&(tPR<800))
		{
			System.out.println(inBookStack.peek());	
			tPR+=inBookStack.pop().getNumPages();	
		}
		System.out.println("\nThe total number of pages read is: "+tPR+"\n");

	}

}
