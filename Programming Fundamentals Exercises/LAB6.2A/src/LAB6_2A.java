// Program Name: LAB6_2A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB6_2A 
{

	public static void main(String[] args)throws FileNotFoundException 
	{	
		Order currentOrder = new Order();
		currentOrder.readOrders();
		System.out.println(currentOrder);
	}

}
