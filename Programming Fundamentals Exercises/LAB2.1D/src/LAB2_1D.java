// Program Name: LAB2_1D
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
public class LAB2_1D {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 

		double interestRate, loanBalance, monthlyinterestAmt;

		System.out.println("Enter the interest rate and loan balance");
		interestRate = keyboard.nextDouble();
		loanBalance = keyboard.nextDouble();

		monthlyinterestAmt=loanBalance*(interestRate/1200);

		System.out.printf("The monthly interest amount is $%.2f\n", monthlyinterestAmt);




	}

}
