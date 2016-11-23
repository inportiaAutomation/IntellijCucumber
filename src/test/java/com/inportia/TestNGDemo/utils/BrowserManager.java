package com.inportia.TestNGDemo.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager 
{
       private WebDriver driver;
       
       private BrowserManager(){}
       
       public WebDriver get_browser(String type)
       {
    	   if(driver == null)
    	   {
    		    String path_chrome = System.getProperty("user.dir") + "\\src\\test\\java\\com\\inportia\\TestNGDemo\\tools\\chromedriver.exe";
    	    	System.setProperty("webdriver.chrome.driver", path_chrome);
    	    	
    	    	driver = new ChromeDriver();
    	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	    	driver.manage().window().maximize();
    	   }
    	   return driver;
       }
       
       
}
