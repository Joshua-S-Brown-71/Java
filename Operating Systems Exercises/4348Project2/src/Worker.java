import java.util.concurrent.Semaphore;
import java.util.*;
import java.io.*;

public class Worker implements Runnable 
{
	public int pwNum;
	public static Queue<Integer> requestCQ = new LinkedList<>();
	private int nextCNum;

	Worker(int inNumPW) 
	{
		pwNum = inNumPW;
	}

	public void run() 
	{
		createPW();
		while(true) 
		{
			wait(Main.nextC);
			wait(Main.mutex);
			removeLineC();
			signal(Main.mutex);
			signal(Main.coord1);
			wait(Main.coord2);
			serveC();
			signal(Main.finishedC[nextCNum]);
			wait(Main.leaveC);
			signal(Main.availablePW);
		}
	}

	public void createPW() 
	{
		System.out.println("Postal Worker "+pwNum+" created");
	}
	
	public void removeLineC() 
	{
		nextCNum=Main.line.remove();
		System.out.println("Postal worker "+pwNum+" serving Customer "+nextCNum);
		Main.arrayC[nextCNum].workerNum=pwNum;
	}

	public void serveC() 
	{
		int task=requestCQ.remove();
		switch(task) 
		{
			case 1:
				try 
				{
					Thread.sleep(1000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				System.out.println("Postal worker "+pwNum+" finished serving customer "+nextCNum);
				break;
			case 2:
				try 
				{
					Thread.sleep(1500);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				System.out.println("Postal worker "+pwNum+" finished serving customer "+nextCNum);
				break;
			case 3:
				wait(Main.scalePW);
				System.out.println("Scales in use by postal worker "+pwNum);
				try 
				{
					Thread.sleep(2000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				System.out.println("Scales released by postal worker "+pwNum);
				signal(Main.scalePW);
				System.out.println("Postal worker "+pwNum+" finished serving customer "+nextCNum);
				break;
		}
	}

	public void wait(Semaphore inSem) 
	{
		try 
		{
			inSem.acquire();
		} 
		catch (InterruptedException e) 
		{
		}
	}
	public void signal(Semaphore inSem) 
	{
		inSem.release();
	}
}