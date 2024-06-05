//Creates and keeps track of MyStockNode info

import java.util.*;
import java.io.*;

public class MyStackNode<E> 
{
	public E value;
	public MyStackNode<E> next;

	public MyStackNode(E o)
	{
		value=o;
		next=null;
	}

	public E getValue()
	{
		return value;
	}

}



