// Program Name: LAB4_1A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
public class LAB4_1A {

	public static void main(String[] args) 
	{
		int d1,d2;

		DiceBot die1=new DiceBot(1);		
		DiceBot die2=new DiceBot(1);

		die1.rollDice();	
		die2.rollDice();	

		d1=die1.getValue();
		d2=die2.getValue();

		if(d1==d2)
		{
			System.out.println("Doubles");
		}
		else if(d1>d2)
		{
			System.out.println("die1 is larger");
		}
		else if(d1<d2)
		{
			System.out.println("die2 is larger");
		}
		else
		{
			System.out.println("broken");
		}

		die1.drawDice();
		die2.drawDice();

	}

}
