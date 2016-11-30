package com.inportia.TestNGDemo.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class PropertiesManager 
{
	
	static String properties_location = System.getProperty("user.dir");
	
	public static void create_properties_file(String fileName)
    {
		try
		{
		  OutputStream outFile = new FileOutputStream(fileName);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Error creating a file."+ex.getMessage());
		}
    }
	
}
