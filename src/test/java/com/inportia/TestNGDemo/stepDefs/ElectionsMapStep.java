package com.inportia.TestNGDemo.stepDefs;

import com.inportia.TestNGDemo.pageObject.ElectionsMapPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElectionsMapStep {
	
	ElectionsMapPage election_map_page = new ElectionsMapPage();
	
	
	@Given("^user is on Election Map$")
	public void user_is_on_Election_Map() throws Throwable {
	  
	}

	@When("^user selects \"([^\"]*)\" and state as \"([^\"]*)\"$")
	public void user_selects_and_state_as(String arg1, String arg2) throws Throwable {

	}

	@When("^user selects year as \"([^\"]*)\"$")
	public void user_selects_year_as(String arg1) throws Throwable {

	}

	@Then("^find the turnout percentage for \"([^\"]*)\"$")
	public void find_the_turnout_percentage_for(String arg1) throws Throwable {

	}

}
