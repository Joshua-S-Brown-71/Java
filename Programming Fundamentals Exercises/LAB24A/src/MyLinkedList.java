//Creates and keeps track of MyLinkedList info

import java.util.*;
import java.io.*;

public class MyLinkedList
{
	public MyLinkedNode head;
	public MyLinkedNode tail;
	public int size;

	public MyLinkedList()
	{
		head=null;
		tail=null;
		size=0;
	}

	public void addLast(String s) 
    {
 	   MyLinkedNode newNode = new MyLinkedNode(s); 
	
 	   if (tail == null) 
 	   {
 	     head = newNode;
       tail = newNode; 
 	   }
 	   else 
 	   {
 	     tail.next = newNode; 
 	     tail = newNode; 
 	   }
	
  	  size++; 
  	}

	public String getLast() 
    {
      if (size == 0) 
      {
        return null;
      }
      else 
      {
        return tail.name;
      }
    }

    public String getFirst() 
    {
      if (size == 0) 
      {
        return null;
      }
      else 
      {
        return head.name;
      }
    }

	public String toString()
	{
		String list="";
		MyLinkedNode current=head;
		
		while (current != null) 
		{
	  		list+=(current.name+" ");
	  		current=current.next;
    	}

    	return list;
    }

    public<E extends Comparable> void check(String input)
    {
    	MyLinkedNode current=head;
		
		while (current != null) 
		{
	  		if((current.name).compareTo(input)>0)
	  		{
	  			
	  		}
	  		current=current.next;
    	}
    	
    }
}








