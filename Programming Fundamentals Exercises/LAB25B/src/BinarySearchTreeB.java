//Creates and keeps track of BinarySearchTreeB info

import java.util.*;
import java.io.*;

public class BinarySearchTreeB<E> 
{
	public TreeItemB<E> root;
	public int size=0;



	public BinarySearchTreeB()
	{
		root=null;
	}

	public boolean insert(String e1)
	{
    	if (root == null)
    	{
    		root = new TreeItemB<>(e1); // Create a new root
    	}
    	else 
    	{
		    // Locate the parent node
		    TreeItemB<E> parent = null;
		    TreeItemB<E> current = root;

    		while (current != null)
    		{
		        if (e1.compareTo(current.value)<0) 
		        {
		        	parent = current;
		            current = current.left;
		        }
		        else if (e1.compareTo(current.value)>0) 
		        {
		        	parent = current;
		        	current = current.right;
		        }
		        else
		        {
        			return false; // Duplicate node not inserted
        		}
        	}

	    	// Create the new node and attach it to the parent node
	        if (e1.compareTo(parent.value)<0)
	        {
	        	parent.left = new TreeItemB<>(e1);
	        }
	        else
	        {
	        	parent.right = new TreeItemB<>(e1);
	        }
    	}

    	size++;
	    return true; // Element inserted successfully
	}

	public boolean search(String e2) 
	{
		TreeItemB<E> current = root; // Start from the root
	   while (current != null)
    		{
		        if (e2.compareTo(current.value)<0) 
		        {
		            current = current.left;
		        }
		        else if (e2.compareTo(current.value)>0) 
		        {
		        	current = current.right;
		        }
		        else
		        {
        			return true; 
        		}
        	}

	    return false; // Element is not in the tree
	}

	public int getSize()
	{
		return size;
	}

	

	/** Inorder traversal from a subtree */
  protected void inorder(TreeItemB<E> inRoot) 
  {
  		if (inRoot == null) 
		{
	  		return;
		}

	    inorder(inRoot.left);

	    System.out.println(inRoot.value);

	    inorder(inRoot.right);
  }

   protected void preorder(TreeItemB<E> inRoot) 
   {
   		if (inRoot == null) 
    	{
    		return;
  		}	

    	System.out.println(inRoot.value);

    	preorder(inRoot.left);
    	preorder(inRoot.right);
  }

  protected void postorder(TreeItemB<E> inRoot) 
  {
    	if (inRoot == null) 
    	{
    		return;
    	}
    	postorder(inRoot.left);
    	postorder(inRoot.right);
    	
    	System.out.println(inRoot.value);
  }

  

}
