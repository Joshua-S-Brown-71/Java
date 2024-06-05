//Creates and keeps track of DiceGame_6 info

import java.util.*;
import java.io.*;

public class DiceGame_6 
{
	protected int first, second, third, score;

	public DiceGame_6()
	{
		first=0;
		second=0;
		third=0;
		score=0;
	}

	public int roll()
	{
		Random rn = new Random();

		return(rn.nextInt(6)+1);
	}

	public void draw(int first, int second, int third)
	{
		System.out.println("-----	"+"-----	"+"-----");
		System.out.println("| "+first+" |"+"	| "+second+" |	"+"| "+third+" |");
		System.out.println("-----	"+"-----	"+"-----");		
	}

	public void play()
	{
		while(score<20)
		{
			first=roll();
			second=roll();
			third=roll();

			draw(first, second, third);

			if(first==second && first==third)
			{
				System.out.println("You have won");

				return;
			}

			if(first<second && second<third)
			{
				System.out.println("You have lost\n");

				return;
			}

			if(first==second || first==third || second==third)
			{
				score+=5;
			}

			System.out.println("The score is: "+score+"\n");
			
		}

		if(score>=20)
		{
			System.out.println("You have won");

			return;
		}
		
	}


}
