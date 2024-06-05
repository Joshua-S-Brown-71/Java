// Program Name: LAB3_1B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
public class LAB3_1B 
{
	public static void main(String[] args) 
	{
		double s1Length, s2Length, s3Length;

		Song song1 = new Song("Radioactive", "Pentatonix", 4.24);
		Song song2 = new Song("Piano Man", "Billy Joel", 3.30);
		Song song3 = new Song("Imagine", "Pentatonix", 3.51);

		s1Length=song1.getLength();
		s2Length=song2.getLength();
		s3Length=song3.getLength();

		
		if(s1Length>s2Length&&s1Length>s3Length)
		{
			System.out.println("The song with the longest length is: "+song1.getName()+", With a length of: "+song1.getLength()+"\n");
		}
		else if(s2Length>s1Length&&s2Length>s3Length)
		{
			System.out.println("The song with the longest length is: "+song2.getName()+", With a length of: "+song2.getLength()+"\n");
		}
		else
		{
			System.out.println("The song with the longest length is: "+song3.getName()+", With a length of: "+song3.getLength()+"\n");
		}

		System.out.println(song1+"\n");
		System.out.println(song2+"\n");
		System.out.println(song3+"\n");
		
	}

}
