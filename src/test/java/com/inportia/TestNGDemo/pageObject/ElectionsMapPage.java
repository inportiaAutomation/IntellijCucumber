package com.inportia.TestNGDemo.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.inportia.TestNGDemo.utils.BrowserManager;

public class ElectionsMapPage 
{
	
	By election_type_select = By.id("type");
	By state_select = By.id("ac_all_state");
	By select_ac_year = By.id("ac_all_state_year");
	
	By election_map_link = By.linkText("Election Maps");
	
	public void user_clicks_electionMap()
	{
		BrowserManager.init_browser().findElement(election_map_link).click();
	}
	
	public void select_election_type(String type)
	{
		Select select_election = new Select(BrowserManager.init_browser().findElement(election_type_select));
		select_election.selectByVisibleText(type);
	}
	
	public void select_state_type(String state)
	{
		Select select_state = new Select(BrowserManager.init_browser().findElement(state_select));
		select_state.selectByVisibleText(state);
	}
	
	public void select_year(String year)
	{
		Select select_year = new Select(BrowserManager.init_browser().findElement(select_ac_year));
		select_year.selectByVisibleText(year);
	}
	
	
	

}
