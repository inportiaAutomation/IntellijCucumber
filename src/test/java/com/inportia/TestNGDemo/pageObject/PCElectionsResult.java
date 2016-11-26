package com.inportia.TestNGDemo.pageObject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inportia.TestNGDemo.utils.BrowserManager;

public class PCElectionsResult extends BasePage {
  
	
	
	 By votes_table = By.xpath(".//*[@id='charttable']/table/tbody/tr");
	 
	 
	  public void get_bjp_vote_pc(String value)
	  {
		 List<WebElement> rows = BrowserManager.init_browser().findElements(votes_table);
		
		 System.out.println(rows.size());
		 for(WebElement r : rows)
		 {
			 System.out.println(r.getText());
			if(r.getText().contains(value))
			{
				
			   String text = r.getText();
			   Assert.assertNotEquals("0",text);
			}
		 }
	  }
} 
