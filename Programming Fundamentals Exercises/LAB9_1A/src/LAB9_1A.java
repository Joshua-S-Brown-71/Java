// Program Name: LAB8_1A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB9_1A 
{

	public static void main(String[] args) 
	{
		Student anna = new Student("Anna Heller", 11);
		MSTStudent sally = new MSTStudent("Sally Boleyn", 9, "Project 1", 95 );
		MSTStudent helen = new MSTStudent("Helen Norris", 10, "Project 2", 90 );

		anna.getName(8, 29.00);
		sally.getName(8, 32.00);
		helen.getName(7, 25.50);

		System.out.println(anna);
		System.out.println(sally);
		System.out.println(helen);

		if(sally.isMyGPAHigher(helen))
		{
			System.out.println("\nSally's grade is higher then Helen's");
		}
		else if(!(sally.isMyGPAHigher(helen)))
		{
			System.out.println("\nHelen's grade is higher then Sally's");			
		}

	}

}
