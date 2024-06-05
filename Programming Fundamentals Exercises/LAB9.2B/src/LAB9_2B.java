// Program Name: LAB9_2A 
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB9_2B 
{
	
	public static void main(String[] args) throws IOException
	{
		int i=0;
		String info="";
		String[] arr1;
		File f = new File("Lab9_2B.txt");
		Scanner s = new Scanner(f);

		while(s.hasNext())
		{
			info+=s.nextLine()+" ";
		}
		
		StringTokenizer strTokenizer =new StringTokenizer(info," ,");

		arr1=new String[strTokenizer.countTokens()];
		
		while (strTokenizer.hasMoreTokens())
		{
			arr1[i]=strTokenizer.nextToken();
			i++;
		}

		Customer_Cable cc1 = new Customer_Cable((arr1[0]+" "+arr1[1]),arr1[2],arr1[3]);
		Customer_Cable cc2 = new Customer_Cable((arr1[4]+" "+arr1[5]),arr1[6],arr1[7]);
		Customer_Cable_Internet cci1 = new Customer_Cable_Internet((arr1[8]+" "+arr1[9]),arr1[10],arr1[11],arr1[12]);
		Customer_Cable_Internet cci2 = new Customer_Cable_Internet((arr1[13]+" "+arr1[14]),arr1[15],arr1[16],arr1[17]);

		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cci1);
		System.out.println(cci2);
		
		s.close();





		
  
	}

}
