// Program Name: LAB9_2C 
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB9_2C 
{

	public static void main(String[] args)throws IOException
	{
		int sA=Integer.MAX_VALUE,sAI=-1;
		File f = new File("Lab9_2C.txt");
		Scanner s = new Scanner(f);
		ArrayList<Room> arr1 = new ArrayList<Room>();	

		while(s.hasNext())
		{
			arr1.add(new Room(s.next(),s.nextInt(),s.nextInt()));
			
		}

		System.out.println(arr1);        

		for(int i=0;i<arr1.size();i++)
		{
			/*Room rm = (Room)arr1.get(i);	
			if(rm*/if(((Room)arr1.get(i)).getArea()<sA)
			{
				sA=((Room)arr1.get(i)).getArea();
				sAI=i;
			}		
		}


		System.out.println("\nThe room with the smallest area: "+arr1.get(sAI));

		s.close();


	}

}
