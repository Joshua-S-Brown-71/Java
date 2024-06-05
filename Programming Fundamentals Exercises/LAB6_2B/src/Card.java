//Creates and keeps track of Card info

import java.util.*;
import java.io.*;

public class Card 
{
	private int cardValue;
	private String cardSuite;

	public Card()
	{
		int value;
		Random rN = new Random();

		cardValue=rN.nextInt(14)+1;
		value=rN.nextInt(4);

		switch(value)
		{
			case 0:
				cardSuite="hearts";
				break;
			case 1:
				cardSuite="diamonds";
				break;
			case 2:
				cardSuite="spades";
				break;
			case 3:
				cardSuite="clubs";
				break;
			default:
				System.out.println("Broken");
		}

		drawCard(cardValue,cardSuite);
	}

	public void drawCard(int inValue, String inSuite)
	{
		switch(inSuite)
		{
			case "hearts":
				inSuite="* Hearts *";
				break;
			case "diamonds":
				inSuite="*Diamonds*";
				break;
			case "spades":
				inSuite="* Spades *";
				break;
			case "clubs":
				inSuite="** Clubs *";
				break;
			default:
				System.out.println("Broken");
		}

		switch(inValue)
		{
			case 1:
				System.out.println("**********\n"+"**** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 2:
				System.out.println("**********\n"+"**** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 3:
				System.out.println("**********\n"+"**** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 4:
				System.out.println("**********\n"+"**** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 5:
				System.out.println("**********\n"+"**** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 6:
				System.out.println("**********\n"+"**** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 7:
				System.out.println("**********\n"+"**** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 8:
				System.out.println("**********\n"+"**** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 9:
				System.out.println("**********\n"+"**** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 10:
				System.out.println("**********\n"+"*** "+inValue+" ***\n"+inSuite+"\n"+"**********\n");
				break;
			case 11:
				System.out.println("**********\n"+"** "+"Jack"+" **\n"+inSuite+"\n"+"**********\n");
				break;
			case 12:
				System.out.println("**********\n"+"* "+"Queen"+" **\n"+inSuite+"\n"+"**********\n");
				break;
			case 13:
				System.out.println("**********\n"+"** "+"King"+" **\n"+inSuite+"\n"+"**********\n");
				break;
			case 14:
				System.out.println("**********\n"+"*** "+"Ace"+" **\n"+inSuite+"\n"+"**********\n");
				break;

			default:
				System.out.println("Broken");
		}
	}

	public int getValue()
	{
		return cardValue;
	}
}
