// Program Name: LAB2_2B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
public class LAB2_2B {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 

		double x1, x2, y1, y2, distance;

		System.out.println("Enter the coordinate of x1");
		x1 = keyboard.nextDouble();
		System.out.println("Enter the coordinate of x2");
		x2 = keyboard.nextDouble();
		System.out.println("Enter the coordinate of y1");
		y1 = keyboard.nextDouble();
		System.out.println("Enter the coordinate of y2");
		y2 = keyboard.nextDouble();

		distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

		System.out.printf("The disctance is: %.3f\n",distance);

	}

}
