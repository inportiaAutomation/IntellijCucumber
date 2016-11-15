package com.inportia;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "C:\\Users\\GS-1034\\IdeaProjects\\CucumberTutorial\\src\\test\\java\\com\\inportia\\TestNGDemo\\fetaures",
                glue = "com\\inportia\\TestNGDemo\\stepDefs",
                tags = {"@test_01"}
        )

public class CucumberRunner
{

}
