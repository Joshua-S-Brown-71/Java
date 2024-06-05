// Program Name: LAB7_2B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB7_2B 
{

	public static void main(String[] args)throws IOException
	{
		String name, highestName;
		double price=0,total=0, subtotal=0, tax =0, highest=0;
		int quantity=0;
		Item[] cartArray = new Item[4];

		File f = new File("Lab7_2B.txt");
		Scanner s = new Scanner(f);

		

      	for(int i=0;i<cartArray.length;i++)
      	{
      			name=s.next();
      			price=s.nextDouble();
      			quantity=s.nextInt();

      			cartArray[i]= new Item(name, price, quantity);

      			System.out.println(cartArray[i]+"\n");

      			subtotal+=cartArray[i].getTotalCost();
      	}
      	

      	s.close();  

      	tax=subtotal*0.0825;
      	total=subtotal+tax;

      	System.out.println("\nSubtotal: "+String.format("%.2f",subtotal)+"\nTax: "+String.format("%.2f",tax)+"\nTotal: "+String.format("%.2f",total));

      	highest=cartArray[0].getTotalCost();
      	highestName=cartArray[0].getItemName(); 

      	for(int i=1;i<cartArray.length;i++)
      	{
      		if(cartArray[i].getTotalCost()>highest)
      		{
      			highest=cartArray[i].getTotalCost();
      			highestName=cartArray[i].getItemName();
      		}
      	}

      	System.out.println("\nHighest item total cost: "+String.format("%.2f",highest)+"\nItem name: "+highestName+"\n");


	}

}
