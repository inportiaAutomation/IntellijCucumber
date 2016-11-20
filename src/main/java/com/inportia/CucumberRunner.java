package com.inportia;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src\\test\\java\\com\\inportia\\TestNGDemo\\features",
                glue = "com\\inportia\\TestNGDemo\\stepDefs",
                tags = {"@wip"},
                format = {"pretty","html:target_html/html/cucumber.html","json:target_json/cucumber.json"}
        )

public class CucumberRunner
{

}
