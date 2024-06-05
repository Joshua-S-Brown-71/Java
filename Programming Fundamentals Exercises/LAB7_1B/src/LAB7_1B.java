// Program Name: LAB7_1B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB7_1B 
{

	public static void main(String[] args)throws IOException
	{
		ArrayExaminer array1 = new ArrayExaminer("Lab7_1B1.txt");
		array1.fillArray();
		array1.isPeak();

		ArrayExaminer array2 = new ArrayExaminer("Lab7_1B2.txt");
		array2.fillArray();
		array2.isPeak();


	}

}
