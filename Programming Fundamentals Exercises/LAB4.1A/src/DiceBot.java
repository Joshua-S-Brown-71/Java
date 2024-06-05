//Creates and keeps track of dicebot info
import java.util.*;

public class DiceBot 
{
	private int value;

	Random rN = new Random();


	public DiceBot(int invalue)
	{
		value=invalue;
	}
	public int getValue()
	{
		return value;
	}
	public void rollDice()
	{
		value=rN.nextInt(6)+1;
	}
	public void drawDice()
	{
		switch (value)
		{
		    case 1:
		            System.out.println("-------");
		            System.out.println("|     |");
		            System.out.println("|  o  |");
		            System.out.println("|     |");
		            System.out.println("-------");
		            break;
		    case 2:
		            System.out.println("-------");
		            System.out.println("| o   |");
		            System.out.println("|     |");
		            System.out.println("|   o |");
		            System.out.println("-------");
		            break;
		    case 3:
		            System.out.println("-------");
		            System.out.println("| o   |");
		            System.out.println("|  o  |");
		            System.out.println("|   o |");
		            System.out.println("-------");
		            break;
		    case 4:
		            System.out.println("-------");
		            System.out.println("| o o |");
		            System.out.println("|     |");
		            System.out.println("| o o |");
		            System.out.println("-------");
		            break;
		    case 5:
		            System.out.println("-------");
		            System.out.println("| o o |");
		            System.out.println("|  o  |");
		            System.out.println("| o o |");
		            System.out.println("-------");
		            break;
		    case 6:
		            System.out.println("-------");
		            System.out.println("| o o |");
		            System.out.println("| o o |");
		            System.out.println("| o o |");
		            System.out.println("-------");
		            break;	    
		    default:
		             System.out.println("Broken");
      	}

	}

}




