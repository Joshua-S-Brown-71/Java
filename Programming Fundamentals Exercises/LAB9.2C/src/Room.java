//Creates and keeps track of Room info

import java.util.*;
import java.io.*;

public class Room 
{
	private String rName;
	private int length,width;

	public Room(String inName, int inLength, int inWidth)
	{
		rName=inName;
		length=inLength;
		width=inWidth;
	}

	public int getArea()
	{
		return(length*width);
	}

	public String toString()
	{
		return("\nThe room name is: "+rName+"\nThe length is: "+length+"\nThe width is: "+width+"\nThe area is: "+getArea()+"\n");
	}

}
