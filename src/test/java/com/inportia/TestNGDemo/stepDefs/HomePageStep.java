package com.inportia.TestNGDemo.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

import com.inportia.TestNGDemo.pageObject.ACElections;
import com.inportia.TestNGDemo.pageObject.HomePage;
import com.inportia.TestNGDemo.pageObject.PCElectionsResult;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class HomePageStep
{

//    private WebDriver driver;
//    private String target_url = "http://www.empoweringindia.org/new/home.aspx";
//
//
//    @When("^user is on the homepage$")
//    public void user_is_on_the_homepage() throws Throwable {
//
//        String currentDir = System.getProperty("user.dir");
//        String driver_loc = currentDir + "\\src\\test\\java\\com\\inportia\\TestNGDemo\\tools\\chromedriver.exe";
//        System.out.print(driver_loc);
//        System.setProperty("webdriver.chrome.driver",driver_loc);
//        driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(target_url);
//    }
//
//
//    @When("^then user closes the page$")
//    public void then_user_closes_the_page() throws Throwable {
//        Thread.sleep(4000);
//        driver.close();
//    }
//
//
//
//
//
//    @Given("^user is entering the username \"([^\"]*)\"$")
//    public void user_is_entering_the_username(String arg1) throws Throwable {
//
//    }
//
//    @Given("^user is entering the password \"([^\"]*)\"$")
//    public void user_is_entering_the_password(String arg1) throws Throwable {
//
//    }
//    
    
    

	HomePage home_page; 
	PCElectionsResult  pc_result;
	ACElections ac_election;
	
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        home_page = new HomePage();
    	home_page.user_goes__to_homepage();
    }

    @When("^user selects year \"([^\"]*)\" and states \"([^\"]*)\" from PC Elelections\\(Lok Sabha\\)$")
    public void user_selects_year_and_states_from_PC_Elelections_Lok_Sabha(String arg1, String arg2) throws Throwable {
       home_page.select_year_pc(arg1);
       home_page.select_states_pc(arg2);
    }

    @When("^Clicks go$")
    public void clicks_go() throws Throwable {
        home_page.click_go_pc();
    }

    @Then("^value for BJP in table should not be null$")
    public void value_for_BJP_in_table_should_not_be_null() throws Throwable {
       pc_result = new PCElectionsResult();
       pc_result.get_bjp_vote_pc("BJP");
    }
    
    @When("^user selects year \"([^\"]*)\" and states \"([^\"]*)\" from AC Elections \\(Vidhan Sabha\\)$")
    public void user_selects_year_and_states_from_AC_Elections_Vidhan_Sabha(String arg1, String arg2) throws Throwable {
    	home_page.select_drop_down_states_ac(arg2);
    	home_page.select_drop_down_year_ac(arg1);
        home_page.click_go_ac();
    }
    
  
    @Then("^find the voting percentage for overall MH$")
    public void find_the_voting_percentage_for_overall_MH() throws Throwable {
        
    }

    @Then("^find the voting percentage for pimpri from the table$")
    public void find_the_voting_percentage_for_pimpri_from_the_table() throws Throwable {
    	ac_election = new ACElections();
    	ac_election.get_voting_and_verify_not_null();
    
    }
    
}
