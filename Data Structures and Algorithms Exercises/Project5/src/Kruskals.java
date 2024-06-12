
import java.util.*;
import java.io.*;

public class Kruskals 
{
	public static void main(String[] args) throws IOException
	{
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		HashMap<String,Integer> map = new HashMap<>();
		String[] token;

		int numvert=0;
		int tdist=0;

		File f = new File("assn9_data.csv");
		Scanner s = new Scanner(f);

		while(s.hasNext())
		{
			token = s.nextLine().split(",");  
			map.put(token[0],numvert);
			numvert+=1;

			for(int i=1;i<(token.length-1);i+=2)
			{
				pq.add(new Edge(Integer.parseInt(token[i+1]),token[0],token[i]));
			}
		}
		s.close();

		DisjSets ds = new DisjSets(numvert);

		while(pq.isEmpty()==false)
		{
			Edge temp = pq.poll();

			if(map.containsKey(temp.one) && map.containsKey(temp.two))
			{
				int one=map.get(temp.one);
				int two=map.get(temp.two);

				if(ds.find(one)!=ds.find(two))
				{
					ds.union(ds.find(one),ds.find(two));
					tdist+=temp.dist;
					System.out.println(temp);
				}
			}
			else
			{
				System.out.println("problem");
			}
		}
		System.out.println("\nTotal Distance: "+tdist+" Miles\n");

		System.exit(0);
	}
}
