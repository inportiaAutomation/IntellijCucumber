package com.inportia.TestNGDemo.stepDefs;

import cucumber.api.java.en.Given;

public class HomePageStep
{

    @Given("^user is on the homepage$")
    public void user_is_on_the_homepage() throws Throwable {
        System.out.println("Hello World from cucumber.");
    }
}
