// Program Name: LAB23B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB23B 
{
	public static void main(String[] args) throws IOException 
	{
		Student[] arr=new Student[12];

		File f1 = new File("Lab23B.txt");
		Scanner s1 = new Scanner(f1);
		int j=0;
		while(s1.hasNext())
		{
			arr[j]=new Student(s1.next(),s1.next(),s1.nextDouble());
			j++;
		}
		s1.close();

		sort(arr);

		for(Student s:arr)
		{
			System.out.println(s);
		}

	}

	public static void sort(Student[] inArr)
	{
		for (int i=1;i<inArr.length;i++) 
		{
		    Student cE=inArr[i];
		    int k;

		    for (k=(i-1);k>=0 && inArr[k].getGPA()>cE.getGPA();k--) 
		    {
		        inArr[k+1]=inArr[k];
	    	}

	    	inArr[k+1]=cE;
		}
	}
}
