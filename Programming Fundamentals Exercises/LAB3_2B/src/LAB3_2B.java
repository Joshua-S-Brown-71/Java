// Program Name: LAB3_2B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
public class LAB3_2B 
{

	public static void main(String[] args) 
	{
		Mortgage houseLoan1=new Mortgage(100000, 30, 0.05);

		System.out.println("houseLoan1");
		System.out.println(houseLoan1);

		Mortgage houseLoan2=new Mortgage();

		houseLoan2.setValues(150000, 15, 0.052 );

		System.out.println("houseLoan2");
		System.out.println(houseLoan2);


	}

}
