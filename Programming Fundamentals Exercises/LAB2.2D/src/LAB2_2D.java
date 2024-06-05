// Program Name: LAB2_2D
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import javax.swing.JOptionPane;
public class LAB2_2D {

	public static void main(String[] args) {

		String ouncesS, output;
		double ouncesD, costD, sellD;
		int boxes;
		final double boxWeight=8.9, cost=0.50, sell=3.00;

		ouncesS=JOptionPane.showInputDialog("How many ounces of cereal are made each day?");
		ouncesD=Double.parseDouble(ouncesS);

		boxes=(int)(ouncesD/boxWeight);
		costD=boxes*cost;
		sellD=(boxes*sell)-costD;
		

		output=String.format("Ounces made = %.2f ounces\nBoxes = %d\nCost to make = $%.2f\nThe total profit is: $%.2f",ouncesD,boxes,costD,sellD);
		JOptionPane.showMessageDialog(null,output);

		System.exit(0);
	}

}
