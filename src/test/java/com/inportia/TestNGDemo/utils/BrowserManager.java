package com.inportia.TestNGDemo.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager 
{
       private static WebDriver driver;
       private static boolean is_created = false;
       private  BrowserManager(){}
       
       public static  WebDriver init_browser(String type)
       {
    	   if (type == "Chrome") 
    	   {
    	   if(BrowserManager.is_created == false)
    	   {
    		    String path_chrome = System.getProperty("user.dir") + "\\src\\test\\java\\com\\inportia\\TestNGDemo\\tools\\chromedriver.exe";
    	    	System.setProperty("webdriver.chrome.driver", path_chrome);
    	    	
    	    	driver = new ChromeDriver();
    	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	    	driver.manage().window().maximize();
    	    	BrowserManager.is_created = true;
    	   }
    	   }
    	   if (type == "Firefox")
    	   {
    		   
    	   }
    	   
    	   return driver;
       }
       
       
       public static WebDriver init_browser()
       {
    	   if(BrowserManager.is_created == false)
    	   {
    		    String path_chrome = System.getProperty("user.dir") + "\\src\\test\\java\\com\\inportia\\TestNGDemo\\tools\\chromedriver.exe";
    	    	System.setProperty("webdriver.chrome.driver", path_chrome);
    	    	
    	    	driver = new ChromeDriver();
    	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	    	driver.manage().window().maximize();
    	    	BrowserManager.is_created = true;
    	   }
    	   return driver;
       }
       
       public static void tear_down_browser()
       {
    	   try 
    	   {
    	      driver.close();
    	      BrowserManager.is_created = false;
    	   }
    	   catch(Exception ex)
    	   {
    		   ex.printStackTrace();
    	   }
       }
       
       
}
