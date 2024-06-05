//Creates and keeps track of TreeItemA info

import java.util.*;
import java.io.*;

public class TreeItemA<E>
{
	public int value;
	public TreeItemA<E> left;
	public TreeItemA<E> right;

	public TreeItemA(int e)
	{
		value=e;
		left=null;
		right=null;
	}

	public int getValue()
	{
		return value;
	}

	public String toString()
	{
		return("Value: "+String.valueOf(value)+"\n");
	}
}
