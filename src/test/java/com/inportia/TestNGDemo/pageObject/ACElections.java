package com.inportia.TestNGDemo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ACElections {
	
    WebDriver driver;
    public ACElections(WebDriver d)
    {
    	driver = d;
    }
	
	By voting_percentage = By.xpath(".//*[@id='mianContent']/div[2]/div/div/p[3]");
    
	public void get_voting_and_verify_not_null()
	{
		String voting_pc = driver.findElement(voting_percentage).getText();
		System.out.println(voting_pc);
   }
}
