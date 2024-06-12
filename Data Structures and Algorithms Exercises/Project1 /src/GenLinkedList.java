//Creates and keeps track of GenLinkedList info

import java.util.*;
import java.io.*;

public class GenLinkedList<E>
{
	public GenLinkedListNode<E> head;
	public GenLinkedListNode<E> tail;
	public int size;

	public GenLinkedList()
	{
		head=null;
		tail=null;
		size=0;
	}

	public void addFront(E e) 
	{
 		GenLinkedListNode<E> newNode = new GenLinkedListNode<>(e); 
	
 		if (size==0) 
 		{
 	    	head = newNode;
    		tail = newNode; 
 		}
 	  	else 
 	  	{
 	    	newNode.next = head; 
 	    	head = newNode; 
 	  	}
  		size++; 
  	}

	public void addEnd(E e) 
	{
 		GenLinkedListNode<E> newNode = new GenLinkedListNode<>(e); 
	
 		if (size==0) 
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

	public void removeFront() 
	{
		if (size==0) 
		{
			throw new NoSuchElementException("Error: The list is empty\n"); 
		}
		else 
		{
 	    	head=head.next;
 	    	size--; 

 	    	if(size==0)
 	  		{
 	  			head=null;
 	  			tail=null;
 	  		}
		}
  	}

	public void removeEnd() 
	{
		if (size==0) 
		{
			throw new NoSuchElementException("Error: The list is empty\n"); 
		}
		else 
		{
	 	  	GenLinkedListNode<E> pointer=head;

	 	  	for(int i=0;i<(size-2);i++)
	 	  	{
	 	  		pointer=pointer.next;
	 	  	}
				tail=pointer;
				tail.next=null;
	 			size--; 

	 	    if(size==0)
	 	  	{
	 	  		head=null;
	 	  		tail=null;
	 	  	}
		}
	}

	public void set(int position, E e) 
	{
		if(position>size || position<0)
		{
			throw new ArrayIndexOutOfBoundsException("Error: enter a position <"+(size+1)+" && >=0\n");
		}
		else if(position==size)
		{
			addEnd(e);
		}
		else if(size>0)
		{
			GenLinkedListNode<E> pointer = head;
	  
		 	for (int i = 0; i<position; i++)
		 	{
		    	pointer = pointer.next;
		 	}
		 	pointer.contents=e;
		}
		else
		{
			System.out.println("Something is wrong, the list might be empty\n");
		}
	}
  
	public E get(int position) 
	{
 		if(position>(size-1) || position<0)
		{
			throw new ArrayIndexOutOfBoundsException("Error: enter a position <"+size+" && >=0 \n");
		}
		else
		{
			GenLinkedListNode<E> pointer = head;
	  
			for (int i = 0; i < position; i++)
	    	{
	      		pointer = pointer.next;
	   		}
	    	return pointer.contents;
	  	}
	}

	public void swap(int p1, int p2)
	{
		E temp1c,temp2c; 

		if(p2<p1)
		{
  			int temp = p1;
  			p1=p2;
  			p2=temp;
		}
  
		if(p1>(size-1) || p1<0 || p2>(size-1) || p2<0)
	 	{
	 		throw new ArrayIndexOutOfBoundsException("Error: both positions must be <"+size+" && >=0 \n");
	  	}
	  	else 
	  	{
	  		GenLinkedListNode<E> pointer1 = head;
		  	for (int i = 0; i < p1; i++)
		  	{
		    	pointer1 = pointer1.next;
		  	}
		  	temp1c=pointer1.contents;

	  		GenLinkedListNode<E> pointer2 = pointer1;
		  	for(int i = p1; i < p2; i++)
		  	{
		    	pointer2 = pointer2.next;
		  	}
		  	temp2c=pointer2.contents;

		  	set(p1,temp2c);
		  	set(p2,temp1c);		
  		}
	}

   	public void shift(int numsh)
  	{
  		if(Math.abs(numsh)>size)
  		{	
  			throw new ArrayIndexOutOfBoundsException("Error: the number of shifts must be  >=-"+size+" && <="+size+" \n");
  		}
  		else 
  		{
  			if(numsh>0)
  			{
  				for(int i=0;i<numsh;i++)
  				{
  					addEnd(head.contents);
  					removeFront();
  				}	
  			}
  			else if(numsh<0)
  			{
  				for(int i=0;i<Math.abs(numsh);i++)
  				{
  					addFront(tail.contents);
  					removeEnd();
  				}	
  			}
  		}
	}

	public void removeMatching(E e)
 	{
		GenLinkedListNode<E> pointer=head;
		
		for(int i=0;i<size; i++)
		{
		  	if((pointer.contents).equals(e))
		  	{
		  		erase(i,1);
		  	}
		  	pointer=pointer.next;
   		}
	}

  	public void erase(int position, int numel) 
  	{
  		if(position<0 || numel<0 || position>=size || (position+numel)>size)
  		{
  			throw new ArrayIndexOutOfBoundsException("Error: enter a position >=0 && <"+size+" && position + number of elements <="+size+"\n");
  		}
  		else if(position==0)
  		{
  			for (int i = 0; i<numel; i++)
			{
				removeFront();
			}
  		}
  		else if(position<size && (position+numel)<=size)
  		{
  			GenLinkedListNode<E> pointer1 = head;
			for (int i = 0; i<(position-1); i++)
			{
				pointer1 = pointer1.next;
			}

	  		GenLinkedListNode<E> pointer2 = pointer1;
			for (int i = 0; i<numel; i++)
			{
				pointer2 = pointer2.next;
			}
			pointer1.next=pointer2.next;

			if(pointer1.next==null)
			{
				tail=pointer1;
			}
			size-=numel;
		}	
	}
 
	public void insertList(LinkedList<E> inL2, int position)
  	{
  		if(position>size)
  		{
  			throw new ArrayIndexOutOfBoundsException("Error: enter a position <="+size+"\n");
  		}
  		else if(position==0)
  		{
  			for (int i = (inL2.size()-1); i>-1; i--)
		  	{
		    	addFront(inL2.get(i));
		  	}
  		}
  		else if(position==size)
  		{
			for (int i = 0; i<inL2.size(); i++)
		  	{
		    	addEnd(inL2.get(i));
		  	}
  		}
  		else 
  		{
	  		int j=position;
	  		GenLinkedListNode<E> pointer = head;
	  	
		  	for (int i = 1; i < position; i++)
			{
				pointer = pointer.next;
			}

			GenLinkedListNode<E> temp = pointer.next;
			for (int i = 0; i<inL2.size(); i++)
			{
			    pointer.next = new GenLinkedListNode<>(inL2.get(i));
			    pointer=pointer.next;
			    size++;
		  	}
		  	pointer.next=temp;
		}
  	}

  	public String toString()
  	{
		String list="";
		GenLinkedListNode<E> pointer=head;		
		while (pointer != null) 
		{
			list+=(pointer.contents+" ");
			pointer=pointer.next;
	  	}

	    return list;
	}

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

		System.out.println("***   addFront: 100   ***");
		l1.addFront(100);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   addEnd: 200   ***");
		l1.addEnd(200);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   removeFront   ***");
		l1.removeFront();
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   removeEnd   ***");
		l1.removeEnd();
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   set: 5->20   ***");
		l1.set(5,20);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   set: 20->5   ***");
		l1.set(5,5);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   get: 7   ***");
		System.out.println(l1.get(7));
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   swap: 8,2   ***");
		l1.swap(0,1);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");
   
		System.out.println("***   swap: 2,8   ***");
		l1.swap(1,0);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   shift +4   ***");
		l1.shift(4);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   shift -4   ***");
		l1.shift(-4);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   removeMatching: 9   ***");
		l1.removeMatching(9);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");
	
		System.out.println("***   erase: index=5, num elements=4   ***");
		l1.erase(5,4);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");

		System.out.println("***   insertList: index=3   ***");
		l1.insertList(l2,3);
		System.out.println("List: "+l1);
		System.out.println("Size: "+l1.size+"\n");
	}

	private static class GenLinkedListNode<E>
	{
		public E contents;
		public GenLinkedListNode<E> next;

		public GenLinkedListNode(E e) 
		{
	    	contents=e;
	    	next=null;
		}
	}		
}










