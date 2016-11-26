package com.inportia.TestNGDemo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.inportia.TestNGDemo.utils.BrowserManager;

public class ACElections {


	
	By voting_percentage = By.xpath(".//*[@id='mianContent']/div[2]/div/div/p[3]");
    
	public void get_voting_and_verify_not_null()
	{
		String voting_pc = BrowserManager.init_browser().findElement(voting_percentage).getText();
		System.out.println(voting_pc);
   }
}
