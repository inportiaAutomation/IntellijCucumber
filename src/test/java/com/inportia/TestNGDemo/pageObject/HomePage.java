package com.inportia.TestNGDemo.pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	  WebDriver driver;
	
	  public HomePage(WebDriver d)
	  {
		  driver = d;
	  }
	  
	
      By drop_down_year_pc = By.id("year");
      By drop_down_states_pc = By.id("state");
      By go_pc = By.xpath(".//*[@id='form']/input");
      String homepage_url = "http://www.indiavotes.com/";
      
      
      public void user_goes__to_homepage()
      {
    	  driver.get(homepage_url);
      }
      
      public void select_year_pc(String value)
      {
          Select select_year = new Select(driver.findElement(drop_down_year_pc));
          select_year.selectByVisibleText(value);
      }
      
      public void select_states_pc(String value)
      {
    	  Select select_year = new Select(driver.findElement(drop_down_states_pc));
          select_year.selectByVisibleText(value);
      }
	
      public void click_go_pc()
      {
    	  driver.findElement(go_pc).click();
      }
	
}
