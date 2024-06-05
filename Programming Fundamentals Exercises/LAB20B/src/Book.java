//Creates and keeps track of Book info

import java.util.*;
import java.io.*;

public class Book 
{
	private String title, author;
	private int nP;

	public Book(String inTitle, String inAuthor, int inNP)
	{
		title=inTitle;
		author=inAuthor;
		nP=inNP;
	}
	public int getNumPages()
	{
		return nP;
	}
	public String getTitle()
	{
		return title;
	}
	public String toString()
	{
		return("\nThe title is: "+title+"\nThe author is: "+author+"\nThe number of pages is: "+nP+"\n");
	}
}
