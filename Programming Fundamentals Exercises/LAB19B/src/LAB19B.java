// Program Name: LAB19B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB19B 
{
	public static void main(String[] args) throws IOException 
	{
		int sum=0, average=0;

		ArrayList<Box> arrl =new ArrayList<Box>();

		File f = new File("Lab19B.txt");
		Scanner s = new Scanner(f);

		while(s.hasNext())
		{
			arrl.add(new Box(s.next(),s.nextInt()));
		}
		s.close();

		for(int i=0;i<arrl.size();i++)
		{
			sum+=arrl.get(i).getNum();
		}
		average=sum/arrl.size();

		System.out.println("\nThe average number of items per box is: "+average+"\n");
		
		System.out.println(arrl);
	}

}
