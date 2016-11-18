package com.inportia.TestNGDemo.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class HomePageStep
{

    private WebDriver driver;
    private String target_url = "http://www.empoweringindia.org/new/home.aspx";


    @When("^user is on the homepage$")
    public void user_is_on_the_homepage() throws Throwable {

        String currentDir = System.getProperty("user.dir");
        String driver_loc = currentDir + "\\src\\test\\java\\com\\inportia\\TestNGDemo\\tools\\chromedriver.exe";
        System.out.print(driver_loc);
        System.setProperty("webdriver.chrome.driver",driver_loc);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(target_url);
    }


    @When("^then user closes the page$")
    public void then_user_closes_the_page() throws Throwable {
        Thread.sleep(4000);
        driver.close();
    }





    @Given("^user is entering the username \"([^\"]*)\"$")
    public void user_is_entering_the_username(String arg1) throws Throwable {

    }

    @Given("^user is entering the password \"([^\"]*)\"$")
    public void user_is_entering_the_password(String arg1) throws Throwable {

    }
}
