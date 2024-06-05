//Creates and keeps track of Student info

import java.util.*;
import java.io.*;

public class Student 
{
	protected String name;
	protected int grade;
	protected int numClassTaken;
	protected double sumGradePoints;
	protected double gpa;

	public Student()
	{
		name="";
		grade=0;
		numClassTaken=0;
		sumGradePoints=0;
		gpa=0;

		System.out.println("Student constructor with no parameters\n");
	}

	public Student(String inName, int inGrade)
	{
		name=inName;
		grade=inGrade;
		numClassTaken=0;
		sumGradePoints=0;
		gpa=0;

		System.out.println("Student constructor with parameters\n");
	}

	public String getName()
	{
		return name;
	}

	public int getGrade()
	{
		return grade;
	}

	public double getGpa()
	{
		return gpa;
	}

	public void getName(int inNumClassTaken, double inSumGradePoints)
	{
		numClassTaken+=inNumClassTaken;
		sumGradePoints+=inSumGradePoints;

		computeGpa();
	}

	public void computeGpa()
	{
		gpa=sumGradePoints/numClassTaken;
	}

	public String toString()
	{
		return("\nThe name is: "+name+"\nThe grade is: "+grade+"\nThe number of classes taken so far is: "+numClassTaken+"\nThe sum of grade points is: "+sumGradePoints+"\nThe GPA is: "+gpa);
	}

}
