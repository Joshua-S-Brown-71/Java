// Program Name: LAB3_1A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
public class LAB3_1A 
{
	public static void main(String[] args) 
	{



		Employee helen = new Employee("Helen Lee", "Accountant", 45000.00);
		Employee brandon = new Employee("Brandon Charles", "Analyst", 48000.00);

		System.out.println(helen.getName());
		System.out.println(helen.getSalary()+"\n");

		System.out.println(brandon.getName()+"\n");

		helen.giveRaise(0.15);
		brandon.giveRaise(0.10);

        System.out.println(helen+"\n");
        System.out.println(brandon+"\n");



	}
}
