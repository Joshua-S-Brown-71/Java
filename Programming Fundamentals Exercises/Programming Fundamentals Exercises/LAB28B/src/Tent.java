//Creates and keeps track of MyQueue info

import java.util.*;
import java.io.*;

public class Tent 
{
	public int itemNum;
	public int numPpl;
	public String color;

	public Tent(int inItemNum, int inNumPpl, String inColor)
	{
		itemNum=inItemNum;
		numPpl=inNumPpl;
		color=inColor;
	}

	public String toString()
	{
		return ("Item Number - "+itemNum+"\nNumber of people - "+numPpl+"\nColor - "+color+"\n");
	}	



}
