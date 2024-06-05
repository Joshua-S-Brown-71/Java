import java.util.*;
import java.io.*;

public class Printer 
{
	 public static void main( String [ ] args )throws IOException
    {
    	String tName,tFlag;
		int tPriority, tPages,jobPriority;

		BinaryHeap<Printjob> p1 = new BinaryHeap<>();

    	File f = new File("input.txt");
		Scanner s = new Scanner(f);

		while(s.hasNext())
		{
			tName=s.next();
			tPriority=s.nextInt();
			tPages=s.nextInt();
			tFlag=s.next();
			s.nextLine();

			if(tFlag.equals("I")||tFlag.equals("i"))
			{
				p1.insert(new Printjob(tName,tPriority,tPages));
			}
			else if(tFlag.equals("O")||tFlag.equals("o"))
			{
				p1.insert(new OutsidePrintjob(tName,tPriority,tPages));
			}
		}
		s.close();

		while(p1.isEmpty()==false)
		{
			System.out.println(p1.deleteMin());
		}
    }
}




