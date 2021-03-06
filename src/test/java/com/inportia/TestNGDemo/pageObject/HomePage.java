package com.inportia.TestNGDemo.pageObject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inportia.TestNGDemo.utils.BrowserManager;
import com.inportia.TestNGDemo.utils.ExcelManager;
import com.inportia.TestNGDemo.utils.HelperMethods;
import com.inportia.TestNGDemo.utils.PropertiesManager;

public class HomePage extends BasePage {


	
	
	
      By drop_down_year_pc = By.id("year");
      By drop_down_states_pc = By.id("state");
      By go_pc = By.xpath(".//*[@id='form']/input");
      
      // locators for second test case
      By drop_down_states_ac = By.id("stateac");
      By drop_down_year_ac = By.id("yearac");
      By go_ac = By.xpath(".//*[@id='form']/input");
      
      
      String homepage_url = "http://www.indiavotes.com/";
      
      
      public void user_goes__to_homepage()
      {
    	  ExcelManager.create_excel_sheet("loginData.xls");
    	  PropertiesManager.set_property("user_name_2", "sohail_chd_2", "userData.properties",true);
    	  PropertiesManager.set_property("user_name_3", "sohail_chd_3", "userData.properties",true);
     	  System.out.println(PropertiesManager.get_property("user_name_3","userData.properties"));
     	  System.out.println(PropertiesManager.get_property("browser_type", "browserType.properties"));
     	  BrowserManager.init_browser().get(homepage_url);
     	  //HelperMethods.take_screenshot("home_page.png");
      }
      
      public void select_year_pc(String value)
      {
          Select select_year = new Select(BrowserManager.init_browser().findElement(drop_down_year_pc));
          select_year.selectByVisibleText(value);  
      }
      
      public void select_states_pc(String value)
      {
    	  Select select_year = new Select(BrowserManager.init_browser().findElement(drop_down_states_pc));
          select_year.selectByVisibleText(value);
      }
	
      public void click_go_pc()
      {
    	  driver.findElement(go_pc).click();
      }
      
      
      // new functions for locator in second test case
      public void select_drop_down_states_ac(String state_name)
      {
    	  Select select_states = new Select(BrowserManager.init_browser().findElement(drop_down_states_ac));
    	  select_states.selectByVisibleText(state_name);  
      }
      
      public void select_drop_down_year_ac(String year)
      {
    	  Select select_year = new Select(BrowserManager.init_browser().findElement(drop_down_year_ac));
          select_year.selectByVisibleText(year);  
      }
      
      
      public void click_go_ac()
      {
    	  List<WebElement> go_buttons = BrowserManager.init_browser().findElements(go_ac);
    	  go_buttons.get(1).click();
      }
      
      
	
}
