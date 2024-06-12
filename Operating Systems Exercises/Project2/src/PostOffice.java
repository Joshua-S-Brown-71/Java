//PostOffice.java :
/*import java.util.concurrent.Semaphore;
import java.util.*;
import java.io.*;

public class PostOffice 
{
	public static Semaphore maxCapacity = new Semaphore(10, true);
	public static Semaphore Ready = new Semaphore(0, true);
	public static Semaphore Desk = new Semaphore(3, true);
	public static Semaphore mutex = new Semaphore(1, true);
	public static Semaphore coord = new Semaphore(0, true);
	public static Semaphore leave = new Semaphore(0, true);
	public static Semaphore coord1 = new Semaphore(0, true);
	public static Semaphore scale = new Semaphore(1, true);
	public static int count;
	public static Queue<Integer> queue = new LinkedList<>();
	public static final int custNumber = 50;
	public static final int Num = 3;
	public static Semaphore[] finished = new Semaphore[custNumber];

	static 
	{
		for (int i = 0; i < custNumber; i++) 
		{
			finished[i] = new Semaphore(0, true);
		}
	}
	public static Customer[] objCust = new Customer[custNumber];
	public static Worker[] objWork = new Worker[Num];
	public static Thread[] t = new Thread[custNumber];
	public static Thread[] t2 = new Thread[Num];
}*/
