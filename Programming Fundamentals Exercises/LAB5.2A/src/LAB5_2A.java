// Program Name: LAB5_2A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;
public class LAB5_2A 
{
	public static void main(String[] args)throws IOException 
	{
		String iD, cN;
		int cH;
		char cG;

		File mF = new File("Lab5_2A.txt");
		Scanner iF = new Scanner(mF); 

		iD=iF.nextLine();
		StudentGrades sG=new StudentGrades(iD);
		
		while (iF.hasNext())
      	{
           cN=iF.next();
           cH=iF.nextInt();
           cG=iF.next().charAt(0);
           sG.classInfo(cN,cH,cG);
      	}

      iF.close();    
      System.out.println(sG);
	}
}
