//Creates and keeps track of book info

public class Book 
{
	private String title, author;
	private int rating;

	public Book(String intitle, String inauthor, int inrating)
	{
		title=intitle;
		author=inauthor;
		rating=inrating;
	}

	public Book(String intitle, String inauthor)
	{
		title=intitle;
		author=inauthor;
	}

	public String toString()
	{
		return("Title: "+title+"\nAuthor: "+author+"\nRating: "+rating+"\n");

	}

	public String getTitle()
	{
		return title;
	}

	public void setRating(int inrating)
	{
		rating=inrating;
	}


}
