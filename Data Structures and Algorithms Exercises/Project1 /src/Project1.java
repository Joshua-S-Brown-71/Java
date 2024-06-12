/*
// Program Name: Project1
// Name: Joshua Brown
// Purpose: Create a Generic Linked List

import java.util.*;
import java.io.*;

public class Project1 {

	public static void main(String[] args)  
	{
		GenLinkedList<Integer> l1 = new GenLinkedList<>();

		for(int i=0;i<10;i++)
		{
			l1.addEnd(i);
		}
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		LinkedList<Integer> l2	=new LinkedList<>();

		for(int i=20;i<30;i++)
		{
			l2.add(i);
		}

		l1.set(10,1000);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("addFront");
		l1.addFront(100);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("addEnd");
		l1.addEnd(200);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("removeFront");
		l1.removeFront();
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("removeEnd");
		l1.removeEnd();
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("set");
		l1.set(5,20);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("set");
		l1.set(5,5);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("get");
		System.out.println(l1.get(7));
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("swap");
		l1.swap(8,2);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("swap");
		l1.swap(2,8);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("shift +");
		l1.shift(5);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("shift -");
		l1.shift(-5);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("removeMatching");
		l1.removeMatching(9);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("addEnd");
		l1.addEnd(9);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");
	
		System.out.println("erase");
		l1.erase(5,5);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");

		System.out.println("insertList");
		l1.insertList(l2,4);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size);
		System.out.println("head: "+l1.head.contents);
		System.out.println("tail: "+l1.tail.contents+"\n");
	}
}

*/




/*public void set2(int position, E e) 
	{
	  if (position == 0) 
	  {
	    addFront(e);
	  }
	  else if (position >(size-1))
	  {
	    System.out.println("\nError: enter a number <"+size+" && >=0 \n");
	  }
	  else
	  {
	  	GenLinkedListNode<E> pointer = head;
  
	   	for (int i = 1; i < position; i++)
	    {
	      pointer = pointer.next;
	    }
	    GenLinkedListNode<E> temp = pointer.next;
	    pointer.next = new GenLinkedListNode<>(e);
	    (pointer.next).next = temp;
	    size++;
	  }
  }*/


  /*public void swap2(int p1, int p2)
  {
  	E temp1c,temp2c; 

  	if(p1>(size-1) || p2>(size-1))
  	{
  		System.out.println("\nError: enter a number <"+size+" && >=0 \n");
  	}
  	else if(p1<size && p1>=0 && p2<size && p2>=0)
  	{
  		GenLinkedListNode<E> pointer1 = head;
	   	for (int i = 0; i < p1; i++)
	    {
	      pointer1 = pointer1.next;
	    }
	   	temp1c=pointer1.contents;

  	  GenLinkedListNode<E> pointer2 = head;
	   	for (int i = 0; i < p2; i++)
	    {
	      pointer2 = pointer2.next;
	    }	    
	    temp2c=pointer2.contents;

	   	set(p1,temp2c);
	   	pointer2 = head;
	   	for (int i = 0; i <p1; i++)
	    {
	      pointer2 = pointer2.next;
	    }
			GenLinkedListNode<E> temp2 = pointer2.next;
		  pointer2.next = temp2.next;

			set(p2,temp1c);
	   	pointer1 = head;
	   	for (int i = 0; i <p2; i++)
	    {
	      pointer1 = pointer1.next;
	    }
			GenLinkedListNode<E> temp1 = pointer1.next;
		  pointer1.next = temp1.next;	    
  	}
  	else
  	{
  		System.out.println("\nError: enter a number <"+size+" && >=0 \n");  		
  	}
  }*/

  /*public void erase2(int position, int numpos) //link 1 pointer to another and lnk the gap  
  {
  	if((position+numpos)>size)
  	{
			System.out.println("\nError: enter a position <"+(size-1)+" and make sure that position+numpos <="+(size-1)+"\n");
  	}
  	else if(position<(size) && (position+numpos)<=size)
  	{
  		GenLinkedListNode<E> pointer1 = head;
	   	for (int i = 0; i <(position-1); i++)
	    {
	      pointer1 = pointer1.next;
	    }
	    for (int i = 0; i <numpos; i++)
	    {
				GenLinkedListNode<E> temp1 = pointer1.next;
			  pointer1.next = temp1.next;
			}
			size-=numpos;
			System.out.println(size);
		}	
  }*/

//<E extends Comparable<E>>



		


