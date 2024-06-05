// Program Name: LAB7_1A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB7_1A 
{

	public static void main(String[] args) 
	{
		int[] arr1 = {4,10,0,1,7,6,5,3,2,9};
		int c1, c2, c3, c4;


		//*ToDo - print arr1 using the Arrays.toString method
		System.out.println(Arrays.toString(arr1));

		//*ToDo - call the getSum method sending arr1, 3 & 6 as parameters and put the returned value in c1
                     // remember that getSum is a static method, so you call it with the name of the class 
                     //    first instead of the name of an object
		c1=ArrayProcessor.getSum(arr1,3,6);

		System.out.println("sum of spots 3-6  =  " + c1);

		// *ToDo - call the getSum method sending arr1, 2 & 9 as parameters and put the returned value in c2
		c2=ArrayProcessor.getSum(arr1,2,9);

		System.out.println("sum of spots 2-9  =  " + c2);

		// *ToDo - call the getCount method sending arr1 & 4 as parameters and put the returned value in c3
		c3=ArrayProcessor.getCount(arr1,4);

		System.out.println("# of 4s  =  " + c3);

		// *ToDo - call the getCount method sending arr1 & 9 as parameters and put the returned value in c4
		c4=ArrayProcessor.getCount(arr1,9);

		System.out.println("# of 9s  =  " + c4);
	}

}
