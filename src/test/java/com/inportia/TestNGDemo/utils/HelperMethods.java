package com.inportia.TestNGDemo.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class HelperMethods 
{

	    static String file_destination = System.getProperty("user.dir") + "\\failedScreenshot\\";
	    
	    
	    public static void take_screenshot(String save_as)
	    {
	    	File srcFile = ((TakesScreenshot)BrowserManager.init_browser()).getScreenshotAs(OutputType.FILE);
	    	try
	    	{
	    		FileUtils.copyFile(srcFile, new File(file_destination + save_as));
	    		System.out.println("saving file : " + file_destination);
	    	}
	    	catch(IOException ex)
	    	{
	    		ex.printStackTrace();
	    	}
	    }
}
