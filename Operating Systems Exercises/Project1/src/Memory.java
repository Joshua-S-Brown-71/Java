
import java.util.*;
import java.io.*;

public class Memory
{ 
	public static int[] storage = new int [2000];
	public static int index=0;
	public static boolean exitM=false;

	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);

		while(exitM==false)
		{	
	      if (sc.hasNext())
	      {	      
	      	int instr1 = sc.nextInt();								//gets from computer
	      	int instr2 = sc.nextInt();								//gets from computer
		      switch (instr1)	
				{
					case 1: System.out.println(storage[instr2]);	//sends to computer
							break;      

				    case 2: int instr3 = sc.nextInt();				//gets from computer
							storage[instr2]=instr3;
				    		break;
				  
				    case 3:	String mfn = sc.next();					//gets from computer
							// Open the file.
							File f = new File(mfn);
							Scanner s = new Scanner(f);

							while (s.hasNext())
					    	{
								storageFill(s.nextLine());
							}

							// Close the file.
							s.close();
				   		break;

				    case 4:	exitM=true; 
				   		System.exit(0);
				   		break;
				}  
	      }
		}
	}

	public static void storageFill(String inString)
	{
		if(inString.isBlank() || ( inString.charAt(0)!='.' && (!Character.isDigit(inString.charAt(0)))))
		{
			return;
		}
		else if(inString.charAt(0)=='.')
		{
			String[] str=inString.split("\\D");
			index=Integer.parseInt(str[1]);
		} 	
		else
		{
			String[] str=inString.split("(\\D)");
			storage[index]=Integer.parseInt(str[0]);
			index++;
		}	
	}
}
