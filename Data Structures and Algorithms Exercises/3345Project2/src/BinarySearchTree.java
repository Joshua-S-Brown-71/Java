// BinarySearchTree class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void insert(x)       --> Insert x
// void remove(x)       --> Remove x
// boolean contains(x)  --> Return true if x is present
// Comparable findMin()  --> Return smallest item
// Comparable findMax()  --> Return largest item
// boolean isEmpty()     --> Return true if empty; else false
// void makeEmpty()      --> Remove all items
// void printTree()      --> Print tree in sorted order
// ******************ERRORS********************************
// Throws UnderflowException as appropriate

import java.util.*;
import java.io.*;

/**
 * Implements an unbalanced binary search tree.
 * Note that all "matching" is based on the compareTo method.
 * @author Mark Allen Weiss
 */
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>>
{
    private int size=0;

    /** The tree root. */
    private BinaryNode<AnyType> root;

    /**
     * Construct the tree.
     */
    public BinarySearchTree()
    {
        root=null;
    }

    /**
     * Insert into the tree; duplicates are ignored.
     * @param x the item to insert.
     */
    public void insert(AnyType x)
    {
        root=insert(x,root);
    }
  
    /**
     * Remove from the tree. Nothing is done if x is not found.
     * @param x the item to remove.
     */
    public void remove(AnyType x)
    {
        root=remove(x,root);
    }

    /**
     * Find the smallest item in the tree.
     * @return smallest item or null if empty.
     */
    public AnyType findMin()
    {
        if(isEmpty())
            throw new NoSuchElementException("Error: The list is empty\n"); 
            //throw new UnderflowException();
        return findMin(root).element;
    }

    /**
     * Find the largest item in the tree.
     * @return the largest item of null if empty.
     */
    public AnyType findMax()
    {
        if(isEmpty())
            throw new NoSuchElementException("Error: The list is empty\n"); 
            //throw new UnderflowException();
        return findMax(root).element;
    }

    /**
     * Find an item in the tree.
     * @param x the item to search for.
     * @return true if not found.
     */
    public boolean contains(AnyType x)
    {
        return contains(x,root);
    }

    /**
     * Make the tree logically empty.
     */
    public void makeEmpty()
    {
        root=null;
    }

    /**
     * Test if the tree is logically empty.
     * @return true if empty,false otherwise.
     */
    public boolean isEmpty()
    {
        return root==null;
    }

    /**
     * Print the tree contents in sorted order.
     */
    public void printTree()
    {
        if(isEmpty())
            System.out.println("Empty tree");
        else
            printTree(root);
    }

    /**
     * Internal method to insert into a subtree.
     * @param x the item to insert.
     * @param inNode the node that roots the subtree.
     * @return the new root of the subtree.
     */
    private BinaryNode<AnyType> insert(AnyType x,BinaryNode<AnyType> inNode)
    {
        if(inNode==null)
            return new BinaryNode<>(x,null,null);
        int compareResult=x.compareTo(inNode.element);
        if(compareResult<0)
            inNode.left=insert(x,inNode.left);
        else if(compareResult>0)
            inNode.right=insert(x,inNode.right);
         else
            ;  // Duplicate; do nothing
        return inNode;
    }

    /**
     * Internal method to remove from a subtree.
     * @param x the item to remove.
     * @param inNode the node that roots the subtree.
     * @return the new root of the subtree.
     */
    private BinaryNode<AnyType> remove(AnyType x,BinaryNode<AnyType> inNode)
    {
        if(inNode==null)
            return inNode;   // Item not found; do nothing
        int compareResult=x.compareTo(inNode.element);
        if(compareResult<0)
            inNode.left=remove(x,inNode.left);
        else if(compareResult>0)
            inNode.right=remove(x,inNode.right);
        else if(inNode.left!=null && inNode.right!=null) // Two children
        {
            inNode.element=findMin(inNode.right).element;
            inNode.right=remove(inNode.element,inNode.right);
        }
        else
            inNode=(inNode.left!=null)?inNode.left:inNode.right;
        return inNode;
    }

    /**
     * Internal method to find the smallest item in a subtree.
     * @param inNode the node that roots the subtree.
     * @return node containing the smallest item.
     */
    private BinaryNode<AnyType> findMin(BinaryNode<AnyType> inNode)
    {
        if(inNode==null)
            return null;
        else if(inNode.left==null)
            return inNode;
        return findMin(inNode.left);
    }

    /**
     * Internal method to find the largest item in a subtree.
     * @param inNode the node that roots the subtree.
     * @return node containing the largest item.
     */
    private BinaryNode<AnyType> findMax(BinaryNode<AnyType> inNode)
    {
        if(inNode!=null)
            while(inNode.right!=null)
                inNode=inNode.right;
        return inNode;
    }

    /**
     * Internal method to find an item in a subtree.
     * @param x is item to search for.
     * @param inNode the node that roots the subtree.
     * @return node containing the matched item.
     */
    private boolean contains(AnyType x,BinaryNode<AnyType> inNode)
    {
        if(inNode==null)
            return false;
        int compareResult=x.compareTo(inNode.element);
        if(compareResult<0)
            return contains(x,inNode.left);
        else if(compareResult>0)
            return contains(x,inNode.right);
        else
            return true;    // Match
    }

    /**
     * Internal method to print a subtree in sorted order.
     * @param inNode the node that roots the subtree.
     */
    private void printTree(BinaryNode<AnyType> inNode)
    {
        if(inNode!=null)
        {
            printTree(inNode.left);
            System.out.println(inNode.element);
            printTree(inNode.right);
        }
    }

    /**
     * Internal method to compute height of a subtree.
     * @param inNode the node that roots the subtree.
     */
    private int height(BinaryNode<AnyType> inNode)
    {
        if(inNode==null)
            return -1;
        else
            return 1+Math.max(height(inNode.left),height(inNode.right));    
    }

    // Basic node stored in unbalanced binary search trees
    private static class BinaryNode<AnyType>
    {
            // Constructors
        BinaryNode(AnyType theElement)
        {
            this(theElement,null,null);
        }

        BinaryNode(AnyType theElement,BinaryNode<AnyType> lt,BinaryNode<AnyType> rt)
        {
            element=theElement;
            left   =lt;
            right  =rt;
        }

        AnyType element;            // The data in the node
        BinaryNode<AnyType> left;   // Left child
        BinaryNode<AnyType> right;  // Right child
    }

    public BinaryNode<AnyType> find(AnyType x,BinaryNode<AnyType> inNode)
    {
        if(inNode==null)
        {
            return null;
        }
        int compareResult=x.compareTo(inNode.element);
        if(compareResult<0)
        {
            return find(x,inNode.left);
        }
        else if(compareResult>0)
        {
            return find(x,inNode.right);
        }
        else
        {
            return inNode;    
        }
    }

    public BinaryNode<AnyType> findParent(AnyType x,BinaryNode<AnyType> inNode)
    {
        if(inNode==null)
        {
            return null;
        }
        int compareResult=x.compareTo(inNode.element);
        int compareResultL=-1;
        int compareResultR=-1;
        if(inNode.left!=null)
        {
            compareResultL=x.compareTo(inNode.left.element);
        }
        if(inNode.right!=null)
        {
            compareResultR=x.compareTo(inNode.right.element);
        }
        if(compareResultL==0 || compareResultR==0)
        {
            return inNode;          
        }
        else if(compareResult<0)
        {
            return findParent(x,inNode.left);
        }
        else if(compareResult>0)
        {
            return findParent(x,inNode.right);
        }
        else
        {
            return null;    
        }
    }

    public int nodeCount() 
    {        
        return(nodeCountCount(root)); 
    }
    public int nodeCountCount(BinaryNode<AnyType> inNode) 
    {
        if (inNode==null) 
        {
            return size;
        }  
        else if(inNode!=null)
        {
            size++;
        } 
        nodeCountCount(inNode.left);
        nodeCountCount(inNode.right);
        return size;
    }

    public boolean isFull() 
    {
        int fullSize=0;
        int treeSize=nodeCountCount(root);
        for(int i=0;i<=height(root);i++)
        {
            fullSize+=Math.pow(2,i);
        }
        if(treeSize==fullSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean compareStructure(BinarySearchTree<AnyType> inTree) 
    {        
        return(compareStructureStructure(root,inTree.root)); 
    }
    public boolean compareStructureStructure(BinaryNode<AnyType> inNode1,BinaryNode<AnyType> inNode2) 
    {
        if(inNode1==null && inNode2==null)
        {
            return true;      
        } 
        if(inNode1!=null && inNode2!=null)
        {
            return(compareStructureStructure(inNode1.left,inNode2.left) && compareStructureStructure(inNode1.right,inNode2.right));     
        }  
        return false;
    }

    public boolean equals(BinarySearchTree<AnyType> inTree) 
    {        
        return(equalsEquals(root,inTree.root)); 
    }
    public boolean equalsEquals(BinaryNode<AnyType> inNode1,BinaryNode<AnyType> inNode2) 
    {
        if(inNode1==null && inNode2==null)
        {
            return true;      
        } 
        if(inNode1!=null && inNode2!=null && inNode1.element==inNode2.element)
        {
            return(equalsEquals(inNode1.left,inNode2.left) && equalsEquals(inNode1.right,inNode2.right));     
        } 
        return false;
    }
    
    public BinarySearchTree<AnyType> copy() 
    {        
        BinarySearchTree<AnyType> tnew=new BinarySearchTree<>();
        tnew.root=copyCopy(root);
        return tnew;
    }
    public BinaryNode<AnyType> copyCopy(BinaryNode<AnyType> inNode)
    {
        if (inNode==null) 
        {
            return null;
        }
        BinaryNode<AnyType> newNode=new BinaryNode<AnyType>(inNode.element);
        newNode.left=copyCopy(inNode.left);
        newNode.right=copyCopy(inNode.right);
        return newNode;
    }

    public BinarySearchTree<AnyType> mirror() 
    {        
        BinarySearchTree<AnyType> tnew=new BinarySearchTree<>();
        tnew.root=copyCopy(root);
        mirrorMirror(tnew.root);
        return tnew;
    }
    public BinaryNode<AnyType> mirrorMirror(BinaryNode<AnyType> inNode)
    {
        if (inNode==null)
        {
            return inNode;
        }
        BinaryNode<AnyType> left=mirrorMirror(inNode.left);
        BinaryNode<AnyType> right=mirrorMirror(inNode.right);
        inNode.left=right;
        inNode.right=left;
        return inNode;
    }

    public boolean isMirror(BinarySearchTree<AnyType> inTree) 
    {        
        return(ismirrorMirror(root,inTree.root)); 
    }
    public boolean ismirrorMirror(BinaryNode<AnyType> inNode1,BinaryNode<AnyType> inNode2)
    {
        if (inNode1==null && inNode2==null)
        {
            return true;        
        }
        if (inNode1==null || inNode2==null)
        {
            return false;       
        }
        return(inNode1.element==inNode2.element && ismirrorMirror(inNode1.left,inNode2.right) && ismirrorMirror(inNode1.right,inNode2.left));
    }

    public void rotateRight(AnyType x) 
    {
        if(contains(x))
        {
            BinaryNode<AnyType> foundNode=(find(x,root));
            BinaryNode<AnyType> foundNodeP=(findParent(x,root));
            if(foundNode.left!=null)
            {
                BinaryNode<AnyType> tempChild=foundNode.left;
                if(tempChild.right!=null)
                {
                    BinaryNode<AnyType> tempChildRight=tempChild.right;   
                    foundNode.left=tempChildRight;
                }
                else
                {
                    foundNode.left=null;
                }
                if(foundNodeP==null) 
                {
                    root=tempChild;
                } 
                else
                {
                    if(foundNodeP.right==foundNode)
                    {
                        foundNodeP.right=tempChild;
                    }
                    else 
                    {
                        foundNodeP.left=tempChild;
                    }
                }
                tempChild.right=foundNode;
            }
            else
            {
                System.out.println("rotation with "+x+" not possible\n");
            }  
        }
        else
        {
            System.out.println(x+" is not in the tree\n");
        }
    }

    public void rotateLeft(AnyType x) 
    {
        if(contains(x))
        {
            BinaryNode<AnyType> foundNode=(find(x,root));
            BinaryNode<AnyType> foundNodeP=(findParent(x,root));
            if(foundNode.right!=null)
            {
                BinaryNode<AnyType> tempChild=foundNode.right;
                if(tempChild.left!=null)
                {
                    BinaryNode<AnyType> tempChildLeft=tempChild.left;   
                    foundNode.right=tempChildLeft;
                }
                else
                {
                    foundNode.right=null;
                }
                if(foundNodeP==null) 
                {
                    root=tempChild;
                } 
                else
                {
                    if(foundNodeP.right==foundNode)
                    {
                        foundNodeP.right=tempChild;
                    }
                    else 
                    {
                        foundNodeP.left=tempChild;
                    }
                }
                tempChild.left=foundNode;
            }
            else
            {
                System.out.println("rotation with "+x+" not possible\n");
            }  
        }
        else
        {
            System.out.println(x+" is not in the tree\n");
        }  
    }

    public void printLevels()
    {
        for (int i=0;i<=height(root);i++)
        {
            System.out.print("Level "+i+" - ");          
            printCurrentLevel(root,i);
            System.out.print("\n");          
        }
    }
    public void printCurrentLevel(BinaryNode<AnyType> inNode,int level)
    {
        if (inNode==null)
        {
            return;
        }
        if (level==0)
        {
            System.out.print(inNode.element+" ");
        }
        else if (level>0) 
        {
            printCurrentLevel(inNode.left,level-1);
            printCurrentLevel(inNode.right,level-1);
        }
    }

    // Test program
    public static void main(String [ ] args)
    {
        BinarySearchTree<Integer> tree1=new BinarySearchTree<>();
        int[] arr1=new int[] {60,55,100,45,57,67,107,59,101,44,46,56,66,68,108,109};
        for(int x:arr1)
        {
            tree1.insert(x);
        }
        BinarySearchTree<Integer> tree2=new BinarySearchTree<>();
        int[] arr2=new int[] {5,3,8,1,4};
        for(int x:arr2)
        {
            tree2.insert(x);
        }
        BinarySearchTree<Integer> tree3=new BinarySearchTree<>();
        int[] arr3=new int[] {5,3,8,1,4};
        for(int x:arr3)
        {
            tree3.insert(x);
        }
        BinarySearchTree<Integer> tree4=new BinarySearchTree<>();
        int[] arr4=new int[] {10,5,15,2,7};
        for(int x:arr4)
        {
            tree4.insert(x);
        }
        BinarySearchTree<Integer> tree5=new BinarySearchTree<>();
        int[] arr5=new int[] {100,50,150,40,45};
        for(int x:arr5)
        {
            tree5.insert(x);
        }
        BinarySearchTree<Integer> tree6=new BinarySearchTree<>();
        int[] arr6=new int[] {30,100,20};
        for(int x:arr6)
        {
            tree6.insert(x);
        }
        System.out.print("Tree 1: \n");
        tree1.printLevels();
        System.out.print("\n");
        System.out.print("Tree 2: \n");
        tree2.printLevels();
        System.out.print("\n");
        System.out.print("Tree 3: \n");
        tree3.printLevels();
        System.out.print("\n");
        System.out.print("Tree 4: \n");
        tree4.printLevels();
        System.out.print("\n");
        System.out.print("Tree 5: \n");
        tree5.printLevels();
        System.out.print("\n");
        System.out.print("Tree 6: \n");
        tree6.printLevels();
        System.out.print("\n");
        
        System.out.println("**********   nodeCount   **********");
        System.out.println("Tree 1: "+tree1.nodeCount()+"\n");

        System.out.println("**********   isFull   **********");
        System.out.println("Tree 2: "+tree2.isFull());
        System.out.println("Tree 6: "+tree6.isFull()+"\n");

        System.out.println("**********   compareStructure   **********");
        System.out.println("Tree 1 and Tree 2: "+tree1.compareStructure(tree2));
        System.out.println("Tree 2 and Tree 4: "+tree2.compareStructure(tree4)+"\n");

        System.out.println("**********   equals   **********");
        System.out.println("Tree 2 and Tree 3: "+tree2.equals(tree3));
        System.out.println("Tree 2 and Tree 4: "+tree2.equals(tree4)+"\n");

        System.out.println("**********   copy   **********");
        BinarySearchTree<Integer> tNew=new BinarySearchTree<>();
        System.out.print("New Tree: \n");
        tNew.printLevels();
        System.out.print("\n");
        System.out.print("Tree 1: \n");
        tree1.printLevels();
        System.out.print("\n");
        tNew=tree1.copy();
        System.out.print("New Tree: \n");
        tNew.printLevels();
        tNew.makeEmpty();
        System.out.print("\n");

        System.out.println("**********   mirror   **********");
        System.out.print("New Tree: \n");
        tNew.printLevels();
        System.out.print("\n");
        System.out.print("Tree 5: \n");
        tree5.printLevels();
        System.out.print("\n");
        tNew=tree5.mirror();
        System.out.print("New Tree: \n");
        tNew.printLevels();
        System.out.print("\n");

        System.out.println("**********   isMirror   **********");
        System.out.print("New Tree: \n");
        tNew.printLevels();
        System.out.print("\n");
        System.out.println("Tree 5 and New Tree: "+tree5.isMirror(tNew));
        System.out.println("Tree 2 and Tree 3: "+tree2.isMirror(tree3));
        System.out.print("\n");

        System.out.println("**********   rotateRight   **********");
        System.out.print("Tree 5: \n");
        tree5.printLevels();
        System.out.print("\n");
        System.out.print("rotateRight at 100: \n");
        System.out.print("\n");
        tree5.rotateRight(100);
        tree5.printLevels();
        System.out.print("\n");
        System.out.print("rotateRight at 50: \n");
        System.out.print("\n");
        tree5.rotateRight(50);
        tree5.printLevels();
        System.out.print("\n");
        System.out.println("**********   rotateLeft   **********");
        System.out.print("rotateLeft at 40: \n");
        System.out.print("\n");
        tree5.rotateLeft(40);
        tree5.printLevels();
        System.out.print("\n");
        System.out.print("rotateLeft at 50: \n");
        System.out.print("\n");
        tree5.rotateLeft(50);
        tree5.printLevels();
        System.out.print("\n");

        System.out.println("**********   printLevels   **********");
        tree1.printLevels();
        System.out.print("\n");
    }
}