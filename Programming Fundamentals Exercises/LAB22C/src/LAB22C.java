// Program Name: LAB22C
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB22C 
{
	public static void main(String[] args) 
	{
		Random randomNumbers = new Random();

		int[][] arr1= new int[4][4];

		for (int row = 0; row < 4; row++)
		{
			for (int col = 0; col < 4; col++)
			{
				arr1[row][col]=randomNumbers.nextInt(51);
			}
		}		

		m1(arr1);

		for (int row = 0; row < arr1.length; row++)
		{
			for (int col = 0; col < arr1[row].length; col++)
			{
				System.out.print(arr1[row][col]+" ");
			}
		}		

	}

	public static void m1(int[][] inArr)
	{
		int length=0;

		for (int row = 0; row < inArr.length; row++)
		{
			for (int col = 0; col < inArr[row].length; col++)
			{
				length++;
			}
		}

		int[] arr2 = new int[length];

		int c=0;
		for (int row = 0; row < inArr.length; row++)
		{
			for (int col = 0; col < inArr[row].length; col++)
			{
				arr2[c]=inArr[row][col];
				c++;
			}
		}

		int smallest, index, temp;
		int sLength=length;
		for(int i=0;i<(sLength-1);i++)
		{
			smallest=arr2[i];
			index=i;
			for(int k=(i+1);k<sLength;k++)
			{
				if(arr2[k]<smallest)
				{
					smallest=arr2[k];
					index=k;
				}
			}
			temp=arr2[i];
			arr2[i]=arr2[index];
			arr2[index]=temp;
		}

        c=0;
        for (int row = 0; row < inArr.length; row++)
		{
			for (int col = 0; col < inArr[row].length; col++)
			{
				inArr[row][col]=arr2[c];
				c++;
			}
		}




	}

}