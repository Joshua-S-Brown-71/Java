
import java.util.*;
import java.io.*;
import java.lang.Runtime;

public class Computer 
{
	public static int pC=0;
	public static int sP=1000;
	public static int iR=0;
	public static int aC=0;
	public static int x=0;
	public static int y=0;

	public static int timer=0;
	public static int timerIntr=10;
	public static String fn;
	public static boolean blocked=false;
	public static boolean exitC=false;

	public static Runtime rt = Runtime.getRuntime();
	public static Process proc;										// = rt.exec("java -classpath /Users/JOSH/Desktop/4348/proj1ex	HelloYou");
	public static InputStream is;										// = proc.getInputStream();
	public static OutputStream os;									// = proc.getOutputStream(); 
	public static PrintWriter pw;										// = new PrintWriter(os);
   public static Scanner sc;											// = new Scanner(is);
   
	public static void main(String[] args)
	{
		try
    	{          
    		proc= rt.exec("java Memory");
    		is = proc.getInputStream();
    		os = proc.getOutputStream(); 
    		pw = new PrintWriter(os);
    		sc = new Scanner(is);

    		getFN();

			while(exitC==false)
    		{
    			if(timer%timerIntr==0 && timer!=0 && timerIntr!=0)
    			{
    				intr(1000);
					timer++;
    			}
    			else
    			{
					iR = read(pC); 
					pC++;
					timer++;
					execute();
    			}  					
    		}

	 		proc.waitFor();
        	int exitVal = proc.exitValue();
        	System.out.println("Process exited: " + exitVal);
    	} 
    	catch (Throwable t)
     	{
			t.printStackTrace();
    	}	
	}
	
	public static int read(int inIndex)
	{
		if(blocked==false && inIndex>999)
		{
        	System.out.println("ERROR-Unable to access");
			return 0;
		}
		else
		{
			pw.println(1);								//put in buffer
			pw.println(inIndex);						//put in buffer

	      pw.flush();									//send and reset buffer

	      return (sc.nextInt());					//gets from memory
		}
	}
	
	public static void write(int inIndex, int inValue)
	{
		if(blocked==false && inIndex>999)
		{
        	System.out.println("ERROR-Unable to access");
        	return;
		}
		else
		{
			pw.println(2);								//put in buffer
			pw.println(inIndex);						//put in buffer
			pw.println(inValue);						//put in buffer

	      pw.flush();									//send and reset buffer
	   }
	}
	public static void getFN()
	{
		Scanner keyboard=new Scanner(System.in);

		System.out.println("Please enter a file name");
		fn=keyboard.next();
		System.out.println("Please enter a timer interrupt interval");
		timerIntr=keyboard.nextInt();

		pw.println(3);								//put in buffer
		pw.println(0);
		pw.println(fn);

      pw.flush();									//send and reset buffer
	}

	public static void loadValue()
	{
		aC = read(pC);
		pC++;
	}                    
	public static void loadAddr()
	{
		aC=read(read(pC));
		pC++;
	}
	public static void loadIndAddr() 
	{
		aC=read(read(read(pC)));
		pC++;
	}  
	public static void loadIdxXAddr()
	{
		aC=read(x+read(pC));
		pC++;
	}
	public static void loadIdxYAddr()
	{
		aC=read(y+read(pC));
		pC++;
	}
	public static void loadSpX()
	{
		aC=read(sP+x);
	}
	public static void storeAddr()
	{
		write(read(pC),aC);
		pC++;
	}
	public static void get()
	{
		Random randomNumbers = new Random();
		aC=randomNumbers.nextInt(100) + 1;
	}
 	public static void putPort()
	{
		if(read(pC)==1)
		{
			System.out.print(aC);
		}
		else if(read(pC)==2)
		{
			System.out.print((char)aC);
		}
		else
		{
			System.out.println("problem");
		}
		pC++;
	}
	public static void addX()
	{	
		aC+=x;
	}
	public static void addY()
	{		
		aC+=y;
	}
	public static void subX()
	{	
		aC-=x;
	}
	public static void subY()
	{
		aC-=y;
	}
	public static void copyToX()
	{
		x=aC;
	}
	public static void copyFromX()
	{
		aC=x;
	}
	public static void copyToY()
	{		
		y=aC;
	}
	public static void copyFromY()
	{
		aC=y;
	}
	public static void copyToSp()
	{
		sP=aC;
	}
	public static void copyFromSp() 
	{
		aC=sP;
	}  
	public static void jumpAddr()
	{
		pC=read(pC);
	}
	public static void jumpIfEqualAddr()
	{
		if(aC==0)
		{
			pC=read(pC);
		}
		else
		{
			pC++;
		}
	}
	public static void jumpIfNotEqualAddr()
	{
		if(aC!=0)
		{
			pC=read(pC);
		}
		else
		{
			pC++;
		}
	}
	public static void callAddr()
	{ 
		sP--;
		write(sP,(pC+1));
		pC=read(pC);
	}
	public static void ret()
	{
		pC=read(sP);
		sP++;
		
	}
	public static void incX()
	{
		x++;
	}
	public static void decX()
	{
		x--;
	}
	public static void push()
	{
		sP--;
		write(sP,aC);
	}
	public static void pop()
	{
		aC=read(sP);
		sP++;
	}
	public static void intr(int inValue)
	{
		if(blocked==false)
		{
			blocked=true;
			write(1999,sP);
			write(1998,pC);
			sP=1998;
			pC=inValue;
		}
		else
		{
			return;
		}
	}
	public static void iRet()
	{
		if(blocked==true)
		{
			sP=read(1999);
			pC=read(1998);
			blocked=false;
		}
		else
		{
			System.out.println("problem");
		}
	}
	public static void end()	
	{
		pw.println(4);								//put in buffer
	   pw.flush();									//send and reset buffer
	   exitC=true;
		System.exit(0);		
	}


	public static void execute()
	{
		switch (iR)
		{
			case 1: loadValue();
				break;                    
		    case 2: loadAddr();
		    	break;
		    case 3: loadIndAddr();
		    	break;   
		    case 4: loadIdxXAddr();
		    	break;
		    case 5: loadIdxYAddr();
		    	break;
		    case 6: loadSpX();
		    	break;
		    case 7: storeAddr();
		    	break;
		    case 8: get();
		    	break;
		    case 9: putPort();
		    	break;
		    case 10: addX();
		    	break;
		    case 11: addY();
		    	break;
		    case 12: subX();
		    	break;
		    case 13: subY();
		    	break;
		    case 14: copyToX();
		    	break;
		    case 15: copyFromX();
		    	break;
		    case 16: copyToY();
		    	break;
		    case 17: copyFromY();
		    	break;
		    case 18: copyToSp();
		    	break;
		    case 19: copyFromSp(); 
		    	break;  
		    case 20: jumpAddr();
		    	break;
		    case 21: jumpIfEqualAddr();
		    	break;
		    case 22: jumpIfNotEqualAddr();
		    	break;
		    case 23: callAddr();
		    	break;
		    case 24: ret();
		    	break;
		    case 25: incX();
		    	break;
		    case 26: decX();
		    	break;
		    case 27: push();
		    	break;
		    case 28: pop();
		    	break;
		    case 29: intr(1500);
		    	break;
		    case 30: iRet();
		    	break;
		    case 50: end();
	    		break;	
	    }
	}
}


