package com.inportia.TestNGDemo.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesManager 
{
	
	static String properties_location = System.getProperty("user.dir") + "\\utils\\data\\";
	private static Properties prop;
	static OutputStream outFile;
	
	
	public static void set_property(String key,String value,String fileName)
	{
		try
		{
		    outFile = new FileOutputStream(fileName);
			prop = new Properties();
			prop.setProperty(key, value);
			prop.store(outFile, "Storing the key "+key+" value : "+value);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Error creating a file."+ex.getMessage());
		}
		catch(IOException ex)
		{
			System.out.println("Error storing in properties files."+ex.getMessage());
		}
		
	}
	
}
