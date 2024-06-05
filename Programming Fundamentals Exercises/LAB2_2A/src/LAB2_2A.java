// Program Name: LAB2_2A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
public class LAB2_2A {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 

		double sideA, sideB, sideC, s, area;


		System.out.println("Enter the length of the first side");
		sideA = keyboard.nextDouble();
		System.out.println("Enter the length of the second side");
		sideB = keyboard.nextDouble();
		System.out.println("Enter the length of the third side");
		sideC = keyboard.nextDouble();

		s=(sideA+sideB+sideC)/2;
		area=Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

		System.out.printf("The area is: %.3f\n",area);

	}

}
