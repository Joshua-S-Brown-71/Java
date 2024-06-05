//Creates and keeps track of Student info

import java.util.*;
import java.io.*;

public class Student 
{
	private String fN, lN;
	private double gpa;

	public Student(String inFN, String inLN, double inGPA)
	{
		fN=inFN;
		lN=inLN;
		gpa=inGPA;
	}

	public double getGPA()
	{
		return gpa;
	}

	public String toString()
	{
		return("\nFirst name: "+fN+", Last name: "+lN+", GPA: "+gpa);
	}


}
