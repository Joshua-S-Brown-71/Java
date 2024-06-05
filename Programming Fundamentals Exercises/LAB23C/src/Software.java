//Creates and keeps track of Software info

import java.util.*;
import java.io.*;

public class Software 
{
	private String title;
	private double price;
	private int numPlay;

	public Software(String inTitle, double inPrice, int inNumPlay)
	{
		title=inTitle;
		price=inPrice;
		numPlay=inNumPlay;
	}

	public double getPrice()
	{
		return price;
	}

	public int getNum()
	{
		return numPlay;
	}
	

	public String toString()
	{
		return("\nTitle: "+title+", Price: "+price+", Number of Players: "+numPlay);
	}


}