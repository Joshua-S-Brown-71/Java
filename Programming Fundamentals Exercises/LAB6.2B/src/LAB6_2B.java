// Program Name: LAB6_2B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB6_2B 
{

	public static void main(String[] args) 
	{
		System.out.print("User Cards:\n\n");
		Card user1 = new Card();
		Card user2 = new Card();

		System.out.print("Computer Cards:\n\n");
		Card computer1 = new Card();
		Card computer2 = new Card();

		findWinner(user1, user2, computer1, computer2);

	}

	public static void findWinner(Card u1, Card u2, Card c1, Card c2)
	{
		int userValue;
		int compValue;

		userValue=u1.getValue()+u2.getValue();

		if(userValue>21)
		{
			userValue=0;
		}

		compValue=c1.getValue()+c2.getValue();

		if(compValue>21)
		{
			compValue=0;
		}

		if(userValue>compValue)
		{
			System.out.println("The User is the Winner!!!\n");
		}
		else if(compValue>userValue)
		{
			System.out.println("The Computer is the Winner!!!\n");
		}
		else if(userValue==compValue)
		{
			System.out.println("The User and Computer have Tied!!!\n");
		}
		else
		{
			System.out.println("Broken\n");			
		}
	}
}
