// Program Name: LAB2_2C
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import javax.swing.JOptionPane;
public class LAB2_2C {

	public static void main(String[] args) {

		String distanceS, mpgS, pricePerGallonS, output;
		double distanceD, mpgD, pricePerGallonD, totalCostD;


		distanceS=JOptionPane.showInputDialog("What is the distance you are driving in miles?");
		distanceD=Double.parseDouble(distanceS);
		mpgS=JOptionPane.showInputDialog("What is your vehicle's mile per gallon rating?");
		mpgD=Double.parseDouble(mpgS);
		pricePerGallonS=JOptionPane.showInputDialog("What is the current price per gallon?");
		pricePerGallonD=Double.parseDouble(pricePerGallonS);

		totalCostD=(distanceD/mpgD)*pricePerGallonD;
		output=String.format("Distance = %.2f miles\nMiles per gallon = %.2f\nPrice per gallon = $%.2f\nThe total cost of the trip is: $%.2f",distanceD, mpgD, pricePerGallonD, totalCostD);
		JOptionPane.showMessageDialog(null,output);

		System.exit(0);
	}

}
