//Creates and keeps track of MyQueue info

import java.util.*;
import java.io.*;

public class MyQueue<E>
{
	private MyQueueNode <E> head;
	private MyQueueNode <E> tail;
	private int size;

	public MyQueue()
	{
		head=null;
		tail=null;
		size=0;
	}

	public int getSize()
	{
		return size;
	}

	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void enqueue(E o)
	{
		MyQueueNode<E> newNode=new MyQueueNode<>(o);

		if(tail==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
		size++;

	}

	public E dequeue()
	{
		if(size==0)
		{
			return null;
		}
		else
		{
			MyQueueNode<E> temp=head;
			head=head.next;
			size--;
			
			return temp.value;
		}
	}

	public String toString()
	{
		MyQueueNode<E> current = head;

		String output="";
		
    	while (current!=null) 
    	{
    		output+=(current.value);
    		current=current.next;
		}
		return output;
	}


}




