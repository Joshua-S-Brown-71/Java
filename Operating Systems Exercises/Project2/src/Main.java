import java.util.concurrent.Semaphore;
import java.util.*;
import java.io.*;

public class Main{
	public static final int numbrC=50;
	public static final int numbrPW=3;
	public static int count=0;
	public static Queue<Integer> line = new LinkedList<>();
	public static Semaphore insideC = new Semaphore(10,true);
	public static Semaphore availablePW = new Semaphore(3,true);
	public static Semaphore scalePW = new Semaphore(1,true);
	public static Semaphore mutex = new Semaphore(1,true);
	public static Semaphore nextC = new Semaphore(0,true);
	public static Semaphore coord1 = new Semaphore(0,true);
	public static Semaphore coord2 = new Semaphore(0,true);
	public static Semaphore leaveC = new Semaphore(0,true);
	public static Semaphore[] finishedC = new Semaphore[numbrC];
	static
	{
		for(int i=0; i<numbrC; i++) 
		{
			finishedC[i] = new Semaphore(0,true);
		}
	}
	public static Customer[] arrayC = new Customer[numbrC];
	public static Thread[] threadC = new Thread[numbrC];
	public static Worker[] arrayPW = new Worker[numbrPW];
	public static Thread[] threadPW = new Thread[numbrPW];

	public static void main(String args[])
	{
		for(int i=0; i<numbrC; i++) 
		{
			arrayC[i] = new Customer(i);
			threadC[i] = new Thread(arrayC[i]);
			threadC[i].start();
		}

		for(int i=0; i<numbrPW; i++) 
		{
			arrayPW[i] = new Worker(i);
			threadPW[i] = new Thread(arrayPW[i]);
			threadPW[i].start();
		}

		for(int i=0; i<numbrC; i++) 
		{
			try 
			{
				threadC[i].join();
				System.out.println("Joined customer "+i);
			} 
			catch(InterruptedException e) 
			{
			}
		}
		System.exit(0);
	}
}
