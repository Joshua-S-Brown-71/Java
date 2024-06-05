import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClassStatistics 
{
	//*ToDo - add a String variable named filename
	private String filename;

	//*ToDo - add an array of 30 doubles named avgArr
	double[] avgArr = new double[30];

	//*ToDo - add a constructor that receives one string parameter which holds the name of the text file.
        //       It should set filename = to the parameter.
	public ClassStatistics(String inString)
	{
		filename=inString;
	}
		
		//*ToDo - declare and set up your text file to read (using filename as the text file name)

		//*ToDo - Set up a loop to execute as long as there is something in the text file

			//*ToDo - read a string from the text file (using nextLine()), and put it into a string variable
			//*ToDo - call readAndAverage, sending the input string as a parameter, and put the returned 
			//        value into a spot in your avgArr array
		// end loop
	public void readFile() throws FileNotFoundException
	{
		File file = new File(filename);
		Scanner scan = new Scanner(file);

		String input;
		int i =0;

		while(scan.hasNext())
		{
			input=scan.nextLine();
			avgArr[i]=readAndAverage(input);
			i++;
		}		
	}
	
	
	//*ToDo - create a double method named readAndAverage that receives one String parameter named input
	//  This method should do the following:
		//*ToDo - declare and create a String Tokenizer object, sending input in as the parameter and "," as the delimeter
		//*ToDo - the first item in the string is the student ID, we don't really need it
		//*ToDo - the next 4 items are test grades (Test1, Test2, Test3 & Test4.  Put each of them into their own variable.) - no loops needed
		//*ToDo - compute the average of the 4 test scores
		//*ToDo - return the average
	public double readAndAverage(String input)
	{
		int test1=0, test2=0, test3=0, test4=0; 
		StringTokenizer sT = new StringTokenizer(input, ",");
		sT.nextToken();
		test1=Integer.parseInt(sT.nextToken());
		test2=Integer.parseInt(sT.nextToken());
		test3=Integer.parseInt(sT.nextToken());
		test4=Integer.parseInt(sT.nextToken());

		return((test1+test2+test3+test4)/4);
	}
	
	
	//*ToDo - create a void method named statistics that has no parameters
	//   This method should do the following:
		//*ToDo - loop through the avgArr array and count how many A's, B's, C's, D's & F's there are
		//*ToDo - print each of the above counts on its own line with a label
	public void statistics()
	{
		int a=0, b=0, c=0, d=0, f=0;
		
		for(double i:avgArr)
		{
			if(i<=100 && i>89)
				a++;
			else if(i<90 && i>79 )
				b++;
			else if(i<80 && i>69)
				c++;
			else if(i<70 && i>59)
				d++;
			else if(i<60)
				f++;
		}

		System.out.println("The number of A's:"+a+"\n"+"The number of B's:"+b+"\n"+"The number of C's:"+c+"\n"+"The number of D's:"+d+"\n"+"The number of F's:"+f+"\n");
	}
	

	//*ToDo - create a void method named avgClassScores with no parameters
	//   This method should read through the avgArr array and compute the average of all its values
	//   Then it should print the class average
	public void avgClassScores()
	{
		int sum=0;

		for(double i:avgArr)
		{
			sum+=i;
		}

		System.out.println("The average is: "+(sum/avgArr.length)+"\n");
	}
}
