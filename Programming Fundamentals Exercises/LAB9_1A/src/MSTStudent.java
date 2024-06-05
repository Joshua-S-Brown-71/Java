//Creates and keeps track of MSTStudent info

import java.util.*;
import java.io.*;

public class MSTStudent extends Student
{
	private String projectTitle;
	private double projectGrade;

	public MSTStudent(String inName, int inGrade, String inProjextTitle, double inProjectGrade)
	{
		super(inName,inGrade);

		projectTitle=inProjextTitle;
		projectGrade=inProjectGrade;

		System.out.println("MST Student Constructor\n");
	}

	@Override
	public String toString()
	{
		return("\nThe name is: "+name+"\nThe grade is: "+grade+"\nThe number of classes taken so far is: "+numClassTaken+"\nThe sum of grade points is: "+sumGradePoints+"\nThe GPA is: "+gpa+"\nThe project title is: "+projectTitle+"\nThe project grade is: "+projectGrade);
	}

	public boolean isMyGPAHigher(MSTStudent inObj)
	{
		if(inObj.gpa>gpa)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
