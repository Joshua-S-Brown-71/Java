// Program Name: LAB27B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB27B 
{
	public static void main(String[] args) throws IOException 
	{
		int id=0;
		int hashN;
		String name="";


		Gadget [] arr = new Gadget[10];
		Scanner keyboard=new Scanner(System.in);


		File f1 = new File("Lab27B.txt");
		Scanner s1 = new Scanner(f1);

		while(s1.hasNext())
		{
				id=s1.nextInt();
				name=s1.nextLine().trim();

				hashN=hash(id);

				System.out.println("Name: "+name+"\nHash: "+hashN);

				if(arr[hashN]==null)
				{
					arr[hashN]=new Gadget(id, name);
					System.out.println("Put in at "+hashN+"\n");
				}
				else
				{
					while(arr[hashN]!=null)
					{

						hashN++;
						if(hashN==arr.length)
						{
							hashN=0;
						}
					}
					arr[hashN]=new Gadget(id, name);
					System.out.println("Put in at "+hashN+"\n");
				}

		}
		s1.close();

		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]!=null)
			{
				System.out.println("Index: "+j+"\n"+arr[j]);
			}
		}
	}

	public static int hash(int inInt)
	{
		int x=inInt;
		int sum=0;
		while ((String.valueOf(x).length())>=2)
		{
			while (x!=0)
			{
				sum+=(x%20);
				x/=10;
			}
			x=sum;
			sum=0;
		}
		return x;
	}
}
