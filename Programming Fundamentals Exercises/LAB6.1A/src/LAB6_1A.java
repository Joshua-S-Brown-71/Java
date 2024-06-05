// Program Name: LAB6_1A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB6_1A {

	public static void main(String[] args) 
	{
	//*To Do - instantiate a new Account object named ted with the following info ("Ted Murphy", 72354, 102.56)
		Account ted = new Account("Ted Murphy", 72354, 102.56);
   	//*To Do - instantiate a new Account object named anita with the following info ("Anita Gomez", 69713, 40.00, 0.038)
		Account anita = new Account("Anita Gomez", 69713, 40.00, 0.038);
   	//*To Do - instantiate a new Account object named sam with the following info ("Sam Reddy", 93757, 759.32)
		Account sam = new Account("Sam Reddy", 93757, 759.32);
   	
   	//*To Do - print ted's info (using the toString shortcut)
		System.out.println(ted);
   	//*To Do - print anita's info (using the toString shortcut)
		System.out.println(anita);
   	//*To Do - print sam's info (using the toString shortcut)
		System.out.println(sam);

    //* To Do - call the deposit method for ted with 25.85
		ted.deposit(25.85);
	//* To Do - call the deposit method for anita with 500.00
		anita.deposit(500.00);
	
	//* To Do - call the withdraw method for anita with 430.75
		anita.withdraw(430.75);
    //* To Do - call the withdraw method for sam with 800.00  
		sam.withdraw(800.00);

	//* To Do - call the addInterest method for ted sending 0.03 as a parameter
		ted.addInterest(0.03);
	//* To Do - call the addInterest method for anita 
		anita.addInterest();
	//* To Do - call the addInterest method for sam 
		sam.addInterest();
	
   	//*To Do - print ted's info (using the toString shortcut)
		System.out.println(ted);
   	//*To Do - print anita's info (using the toString shortcut)
		System.out.println(anita);
   	//*To Do - print sam's info (using the toString shortcut)
		System.out.println(sam);
	}

}
