// Program Name: LAB8_1B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB8_1B 
{
	public static void main(String[] args) 
	{
		String iPassword;

        Scanner keyboard = new Scanner (System.in);

		System.out.println("Please enter a password");

		iPassword=keyboard.next();

		PasswordChecker password = new PasswordChecker(iPassword);
		
		if(password.checkPassword())
		{
			System.out.println("The password is valid");
		}
		else
		{
			System.out.println("The password is not valid");
		}
	}

}
