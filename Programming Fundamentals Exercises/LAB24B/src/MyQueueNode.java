//Creates and keeps track of MyQueueNode info

import java.util.*;
import java.io.*;

public class MyQueueNode<E>
{
	public E value;
	public MyQueueNode<E> next;

	public MyQueueNode(E o)
	{
		value=o;
		next=null;
	}

	public E getValue()
	{
		return value;
	}
}








