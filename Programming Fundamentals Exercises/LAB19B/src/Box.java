//Creates and keeps track of Box info

import java.util.*;
import java.io.*;

public class Box 
{
	private String boxItem;
	private int numItems;

	public Box(String inName, int inNum)
	{
		boxItem=inName;
		numItems=inNum;
	}

	public String getItem()
	{
		return boxItem;
	}

	public int getNum()
	{
		return numItems;
	}

	public String toString()
	{
		return("The item is: "+boxItem+", The number of items is: "+numItems+"\n");
	}
}
