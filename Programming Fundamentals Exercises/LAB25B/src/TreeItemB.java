//Creates and keeps track of TreeItemB info

import java.util.*;
import java.io.*;

public class TreeItemB<E> 
{
	public String value;
	public TreeItemB<E> left;
	public TreeItemB<E> right;

	public TreeItemB(String e)
	{
		value=e;
		left=null;
		right=null;
	}

	public String getValue()
	{
		return value;
	}

	public String toString()
	{
		return("Value: "+String.valueOf(value)+"\n");
	}
}
