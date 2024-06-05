//Creates and keeps track of Orders info

import java.util.*;
import java.io.*;

public class Orders 
{
	private String name;
	private int widgets;

	public Orders(String inName, int inWidgets)
	{
		name=inName;
		widgets=inWidgets;
	}
	public int getW()
	{
		return widgets;
	}
	public String getN()
	{
		return name;
	}
	public String toString()
	{
		return("\nThe customer is: "+name+", The number of widgets being ordered is: "+widgets);
	}
}
