//Creates and keeps track of Item info

import java.util.*;
import java.io.*;

public class Item 
{
	private String itemName;
	private double itemPrice, itemQuantity, itemTotalCost;

	public Item(String inName,double inPrice, double inQty)
	{
		itemName=inName;
		itemPrice=inPrice;
		itemQuantity=inQty;

		computeCost();
	}

	public void computeCost()
	{
		itemTotalCost=itemQuantity*itemPrice;
	}

	public double getTotalCost()
	{
		return(itemTotalCost);
	}

	public String getItemName()
	{
		return(itemName);
	}

	public String toString()
	{
		return("\nItem name: "+itemName+"\nItem price: "+String.format("%.2f",itemPrice)+"\nItem quantity: "+itemQuantity+"\nItem total cost: "+String.format("%.2f",itemTotalCost));
	}
}
