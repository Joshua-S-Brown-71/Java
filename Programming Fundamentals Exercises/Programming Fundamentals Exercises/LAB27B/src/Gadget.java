//Creates and keeps track of Gadget info

import java.util.*;
import java.io.*;

public class Gadget 
{
	private int gadgetID;
	private String gadgetName;

	public Gadget(int inCID, String inCN)
	{
		gadgetID=inCID;
		gadgetName=inCN;
	}

	public int getID()
	{
		return gadgetID;
	}

	public String toString()
	{
		return("Gadget ID: "+gadgetID+"\nGadget Name: "+gadgetName+"\n ");
	}

}
