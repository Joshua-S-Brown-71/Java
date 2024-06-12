//Creates and keeps track of Cars info

import java.util.*;
import java.io.*;

public class Cars 
{
	private String make;
	private String model;
	private int year;

	public Cars(String inMake, String inModel, int inYear)
	{
		make=inMake;
		model=inModel;
		year=inYear;
	}

	public int getYear()
	{
		return year;
	}

	public String getMake()
	{
		return make;
	}

	public String toString()
	{
		return ("Make - "+make+"\nModel - "+model+"\nYear - "+year+"\n\n");
	}
}


