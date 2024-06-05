// Program Name: LAB6_1B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB6_1B {

	public static void main(String[] args) 
	{
		double sRadius=1.00, cRadius=2.00, cHeight=3.00, side=4.00, length=5.00, width=6.00, bHeight=7.00, sVolume, cyVolume, cuVolume, bVolume =0;

		sVolume=VolumeCalculator.sphere(sRadius); 
		cyVolume=VolumeCalculator.cylinder(cRadius,cHeight); 
		cuVolume=VolumeCalculator.cube(side); 
		bVolume=VolumeCalculator.box(length,width,bHeight); 


		System.out.println(String.format("A SPHERE with RADIUS: %.2f has a VOLUME of: %.2f\n",sRadius,sVolume));	
		System.out.println(String.format("A CYLINDER with RADIUS: %.2f and HEIGHT: %.2f has a VOLUME  of: %.2f\n",cRadius,cHeight,cyVolume));
		System.out.println(String.format("A CUBE with SIDE LENGTH: %.2f has a VOLUME  of: %.2f\n",side,cuVolume));
		System.out.println(String.format("A BOX with LENGTH: %.2f, WIDTH: %.2f, and HEIGHT: %.2f has a VOLUME  of: %.2f\n",length,width,bHeight,bVolume));
	}

}
