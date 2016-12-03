package com.inportia.TestNGDemo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class PropertiesManager 
{
	
	static String properties_location = System.getProperty("user.dir") + "\\src\\test\\java\\com\\inportia\\TestNGDemo\\utils\\data\\";
	private static Properties prop;
	static OutputStream outFile;
	static InputStream load_file;
	
	public static void set_property(String key,String value,String fileName, boolean appendOrNot)
	{
		try
		{
		    outFile = new FileOutputStream(properties_location+fileName,appendOrNot);
			prop = new Properties();
			prop.setProperty(key, value);
			prop.store(outFile, null);
			System.out.println("Storing the key "+key+" value : "+value);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Error creating a file."+ex.getMessage());
		}
		catch(IOException ex)
		{
			System.out.println("Error storing in properties files."+ex.getMessage());
		}
		finally
		{
			try
			{
			  outFile.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
	
	public static String get_property(String key,String fileName)
	{
		String value = null;
		try
		{
			load_file = new FileInputStream(properties_location+fileName);
			prop = new Properties();
			prop.load(load_file);
			value = prop.getProperty(key);
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		return value;
	}
}
