// Program Name: LAB3_2A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
public class LAB3_2A 
{

	public static void main(String[] args) 
	{
		Book book1=new Book("A Tale of Two Cities", "Charles Dickens", 4);
		Book book2=new Book("Foundation", "Isaac Asimov");

		book2.setRating(5);

		System.out.println(book1.getTitle()+"\n");

		System.out.println(book1);

		System.out.println(book2);






	}

}
