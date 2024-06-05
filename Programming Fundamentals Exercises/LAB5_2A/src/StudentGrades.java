//Creates and keeps track of StudentGrades info

import java.util.*;
import java.io.*;
public class StudentGrades 
{
	private int totalCreditHours, totalClasses;
	private double totalGradePoints, currentGPA;
	private String studentID;

	public StudentGrades(String instudentID)
	{
		studentID=instudentID;
		totalCreditHours=0;
		totalClasses=0;
		totalGradePoints=0;
		currentGPA=0;
	}

	public String toString()
	{
		return("Student ID: "+studentID+"\nTotal Classes: "+totalClasses+"\nTotal Credit Hours: "+totalCreditHours+"\nTotal Grade Points: "+totalGradePoints+String.format("\nCurrent GPA: %.2f\n",currentGPA));
	}

	public void classInfo( String inclassName,int inclassHours, char ingrade)
	{
		switch(ingrade)
		{
			case 'A':	
			case 'a':
				totalGradePoints+=(inclassHours*4.0);
				break;
			case 'B':
			case 'b':
				totalGradePoints+=(inclassHours*3.0);
				break;
			case 'C':	
			case 'c':
				totalGradePoints+=(inclassHours*2.0);
				break;
			case 'D':	
			case 'd':
				totalGradePoints+=(inclassHours*1.0);
				break;
			case 'F':
			case 'f':
				totalGradePoints+=(inclassHours*0.0);
				break;
			default:
				System.out.println("Broken");
				break;
		}
		
		totalCreditHours+=inclassHours;
		totalClasses+=1;
		computeGPA();
		System.out.println("Student ID: "+studentID+"\nClass name: "+inclassName+"\nClass Hours: "+inclassHours+"\nLetter Grade: "+ingrade+String.format("\nCurrent GPA: %.2f\n",currentGPA));
	}

	public void computeGPA()
	{
		currentGPA=totalGradePoints/totalCreditHours;
	}
}
