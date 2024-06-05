import java.util.*;
import java.io.*;

public class OutsidePrintjob extends Printjob 
{
	public OutsidePrintjob(String inName,int inPriority,int inPages)
	{
		super(inName,inPriority,inPages);

		cost=(.10*inPages);
	}

	public String toString()
	{
		return("Name: "+name+"\nUser Priority: "+priority+"\nPages: "+pages+"\nCost: "+String.format("$%.2f", cost)+"\n");
	}
}
