//Creates and keeps track of BinarySearchTreeA info

import java.util.*;
import java.io.*;

public class BinarySearchTreeA<E> 
{
	public TreeItemA<E> root;

	public BinarySearchTreeA()
	{
		root=null;
	}

	public boolean insert(int e1)
	{
    	if (root == null)
    	{
    		root = new TreeItemA<>(e1); // Create a new root
    	}
    	else 
    	{
		    // Locate the parent node
		    TreeItemA<E> parent = null;
		    TreeItemA<E> current = root;

    		while (current != null)
    		{
		        if (e1<current.value) 
		        {
		        	parent = current;
		            current = current.left;
		        }
		        else if (e1>current.value) 
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
	        if (e1<parent.value)
	        {
	        	parent.left = new TreeItemA<>(e1);
	        }
	        else
	        {
	        	parent.right = new TreeItemA<>(e1);
	        }
    	}

	    return true; // Element inserted successfully
	}

	public boolean search(int e2) 
	{
		TreeItemA<E> current = root; // Start from the root
	   while (current != null)
    		{
		        if (e2<current.value) 
		        {
		            current = current.left;
		        }
		        else if (e2>current.value) 
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

	

	/** Inorder traversal from a subtree */
  protected void inorder(TreeItemA<E> inRoot) 
  {
	  int children=0;
	  if (inRoot == null) 
	  {
	  	return;
	  }

	  inorder(inRoot.left);

	  if (inRoot.left!=null&&inRoot.right!=null)
	  {
	  	children=2;
	  }
	  else if(inRoot.left!=null||inRoot.right!=null)
	  {
	  	children=1;
	  }

	  System.out.print("\nValue: "+inRoot.value+"\nChildren: "+children+"\n");

	  inorder(inRoot.right);
  }

  

}

