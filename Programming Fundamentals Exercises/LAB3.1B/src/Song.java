//Creates and keeps track of song info

public class Song 
{
	private String name, artist;
	private double songLength;

	public Song(String inname, String inartist, double insongLength)
	{
		name=inname;
		artist=inartist;
		songLength=insongLength;
	}

	public String toString()
	{
		return("Name: "+name+"\nArtist: "+artist+"\nSong length: "+songLength);
	}

	public String getName()
    {
    	return name;
	}

	public double getLength()
	{
		return songLength;
	}


}
