import java.util.*;
import java.io.*;

public class Edge implements Comparable <Edge>
{
	int dist;
	String one;
	String two;
		
	public Edge(int inDist,String inOne, String inTwo)
	{
		dist=inDist;
		one=inOne;
		two=inTwo;	
	}

	public int compareTo(Edge e)
	{ 
		if(dist==e.dist)
		{
			return 0;
			
		}
		else if(dist>e.dist)
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
		return(one+" ----- "+two+" : "+dist+" Miles");
	}
}



