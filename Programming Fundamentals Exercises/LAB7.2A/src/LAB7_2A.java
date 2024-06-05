// Program Name: LAB7_2A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB7_2A 
{

	public static void main(String[] args)throws IOException
	{
		MonthTemperatures month1 = new MonthTemperatures("Lab7_2A1.txt");
		month1.fillArray();
		System.out.println(month1);

		MonthTemperatures month2 = new MonthTemperatures("Lab7_2A2.txt");
		month2.fillArray();
		System.out.println(month2);


	}

}
