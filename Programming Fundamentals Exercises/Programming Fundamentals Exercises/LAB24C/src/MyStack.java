//Creates and keeps track of MyStack info

import java.util.*;
import java.io.*;

public class MyStack<E> 
{
	private MyStackNode <E> top;
	private int size;

	public MyStack()
	{
		top=null;
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

	public void push(E o)
	{
		MyStackNode<E> newNode=new MyStackNode<>(o);

		if(top==null)
		{
			top=newNode;
		}
		else
		{
			MyStackNode<E> temp=top;
			top=newNode;
			top.next=temp;
		}
		size++;
	}

	public E peek()
	{
		return top.value;
	}

	public E pop()
	{
		if(size==0)
		{
			return null;
		}
		else
		{
			MyStackNode<E> temp=top;
			top=top.next;
			size--;
			
			return temp.value;
		}
	}



	public String toString()
	{
		MyStackNode<E> current = top;

		String output="";
		
		while (current!=null)    	
		{
    		output+=String.valueOf(current.value);
    		current=current.next;
		}
		return output;
	}
}




