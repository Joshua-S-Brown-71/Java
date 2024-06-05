//Creates and keeps track of Drinks info

import java.util.*;
import java.io.*;

public class Drinks 
{
	private String name, type;
	private int size;

	public Drinks(String inName, String inType, int inSize)
	{
		name=inName;
		type=inType;
		size=inSize;
	}

	public String toString()
	{
		return ("Name - "+name+"\nType - "+type+"\nSize - "+size+"\n\n");
	}

}






















