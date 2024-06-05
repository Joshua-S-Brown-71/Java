// Program Name: LAB8_1A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB8_1A 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		ClassStatistics robbie = new ClassStatistics("TestGrades.txt");
		robbie.readFile();
		robbie.statistics();
		robbie.avgClassScores(); 
	}

}
