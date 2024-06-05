//Creates and keeps track of VolumeCalulator info

import java.util.*;
import java.io.*;

public class VolumeCalculator 
{
	private static double PI = 3.1415;

	public static double sphere(double radius)
	{
		return ((4.00/3.00)*PI*Math.pow(radius,3.00));
	}
	public static double cylinder(double radius, double height)
	{
		return (PI*Math.pow(radius,2.00)*height);
	}
	public static double cube(double side)
	{
		return (Math.pow(side,3.00));
	}
	public static double box(double length, double width, double height)
	{
		return (length*width*height);
	}
}
