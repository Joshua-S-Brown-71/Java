//Creates and keeps track of DiceGame_10 info

import java.util.*;
import java.io.*;

public class DiceGame_10 extends DiceGame_6
{
	@Override
	public int roll()
	{
		Random rn = new Random();

		return(rn.nextInt(10)+1);
	}

	@Override
	public void play()
	{
		while(score<15)
		{
			first=roll();
			second=roll();
			third=roll();

			draw(first, second, third);

			if(first%5==0 && second%5==0 && third%5==0)
			{
				System.out.println("You have won");

				return;
			}

			if(first>5 && second>5 && third>5)
			{
				System.out.println("You have lost\n");

				return;
			}

			if(first%5==0 && second%5==0 || first%5==0 && third%5==0 || third%5==0 && second%5==0)
			{
				score+=5;
			}

			System.out.println("The score is: "+score+"\n");		
		}

		if(score>=15)
		{
			System.out.println("You have won");

			return;
		}
		
	}
}
