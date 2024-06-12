import java.util.*;
import java.io.*;

public class Printjob implements Comparable<Printjob>
{
	protected String name;
	protected int priority,jobPriority, pages;
	protected double cost;

	public Printjob(String inName,int inPriority,int inPages)
	{
		name=inName;
		priority=inPriority;
		jobPriority=inPriority*inPages;
		pages=inPages;
	}
	
	public int compareTo(Printjob p)
	{ 
		if(jobPriority==p.jobPriority)
		{
			if(priority==p.priority)
			{
				return 0;
			}
			else if(priority>p.priority)
			{
				return 1;
			}
			else 
			{
				return -1; 
			}
		}
		else if(jobPriority>p.jobPriority)
		{
			return 1;
		} 
		else 
		{ 
			return -1; 
		}
	} 

	public String toString()
	{
		return("Name: "+name+"\nUser Priority: "+priority+"\nPages: "+pages+"\n");
	}
}


 