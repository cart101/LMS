package com.smoothstack.LMS.dao;

//import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.smoothstack.LMS.entity.Book;

public class AuthorDAO {

	// Delimiters used in the CSV file
	private static final String COMMA_DELIMITER = ",";
		Scanner scanner = null;
	{
		try {
			// Get the scanner instance
			scanner = new Scanner(new File("tbl_book.csv"));
			// Use Delimiter as COMMA
			scanner.useDelimiter(COMMA_DELIMITER);
			while(scanner.hasNext())
			{
					System.out.print(scanner.next()+"   ");
			}
		} 
		catch (FileNotFoundException fe) 
		{
			fe.printStackTrace();
		}
		finally
		{
			scanner.close();
		}
	}
	
}
