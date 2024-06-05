//Creates and keeps track of PasswordChecker info

import java.util.*;
import java.io.*;

public class PasswordChecker 
{
	private String password;

	public PasswordChecker(String inString)
	{
		password=inString;
	}

	public boolean checkPassword()
	{
		char[] pArray;

		boolean length=false, number=false, nonnumber=false;

		int numberCopy=0;

		pArray=password.toCharArray();

		if(password.length()>7)
		{
			length=true;
		}

		for(char i:pArray)
		{
			if (Character.isDigit(i))
			{
				number=true;
			}
		}

		for(char i:pArray)
		{
			if (!(Character.isLetterOrDigit(i)))
			{
				nonnumber=true;
			}
		}

		for(int i=0;i<(pArray.length-1);i++)
		{
			if (pArray[i]==pArray[i+1])
			{
				numberCopy+=1;
			}
		}

		if(length && number && nonnumber && numberCopy==0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}

