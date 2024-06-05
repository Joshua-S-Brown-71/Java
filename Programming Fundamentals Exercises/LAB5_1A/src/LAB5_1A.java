// Program Name: LAB5_1A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
public class LAB5_1A 
{

	public static void main(String[] args) 
	{
		DivRobot robbie=new DivRobot(6);
		DivRobot ben=new DivRobot();
		DivRobot alice=new DivRobot(8);

		ben.setNumber(12);

		robbie.setRating();
		ben.setRating();
		alice.setRating();

		System.out.println("robbie\n\n"+robbie+"\n");
		System.out.println("ben\n\n"+ben+"\n");
		System.out.println("alice\n\n"+alice+"\n");
	}

}
