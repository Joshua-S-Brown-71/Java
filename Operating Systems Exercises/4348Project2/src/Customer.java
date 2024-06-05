import java.util.concurrent.Semaphore;
import java.util.*;
import java.io.*;

public class Customer implements Runnable 
{
	public int cNum;
	public int taskNum;
	public int workerNum;

	Customer(int inCustNum) 
	{
		cNum=inCustNum;
	}

	public void run() 
	{
		createC();
		wait(Main.insideC);
		enterC();
		wait(Main.availablePW);
		wait(Main.mutex);
		addLineC(cNum);
		signal(Main.nextC);
		signal(Main.mutex);
		wait(Main.coord1);
		requestC();
		signal(Main.coord2);
		wait(Main.finishedC[cNum]);
		finishC();
		exitC();
		signal(Main.leaveC);
		signal(Main.insideC);
		Main.count++;
	}

	public void createC() 
	{
		System.out.println("Customer "+cNum+" created");
		Random rn = new Random();
		taskNum=rn.nextInt(3)+1;
	}

	public void enterC() 
	{
		System.out.println("Customer "+cNum+" enters post office");
	}

	public void addLineC(int inCustNum) 
	{
		Main.line.add(inCustNum);
	}

	public void requestC() 
	{
		System.out.println("Customer "+cNum+" asks postal worker "+workerNum+" to "+taskC(taskNum));
		Main.arrayPW[workerNum].requestCQ.add(taskNum);
	}

	public void finishC() 
	{
		System.out.println("Customer "+cNum+" finished "+taskC2(taskNum));
	}

	public void exitC() 
	{
		System.out.println("Customer "+cNum+" leaves post office");
	}

	private String taskC(int inTask) 
	{
		switch (inTask) 
		{
			case 1:
				return("buy stamps");
			case 2:
				return("mail a letter");
			case 3:
				return("mail a package");
		}
		return("problem");
	}

	private String taskC2(int inTask) 
	{
		switch (inTask) 
		{
			case 1:
				return("buying stamps");
			case 2:
				return("mailing a letter");
			case 3:
				return("mailing a package");
		}
		return("problem");
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
