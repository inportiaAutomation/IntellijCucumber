package com.inportia.TestNGDemo.stepDefs;
import cucumber.api.java.en.Given;

public class TestTableStep
{

    @Given("^this is my first row value \"([^\"]*)\"$")
    public void this_is_my_first_row_value(String username) throws Throwable {

        System.out.println(username);
    }

    @Given("^this is my second row value \"([^\"]*)\"$")
    public void this_is_my_second_row_value(String password) throws Throwable {

        System.out.println(password);
    }


    @Given("^this is my first row value for second test \"([^\"]*)\"$")
    public void this_is_my_first_row_value_for_second_test(String arg1) throws Throwable {
        System.out.println(arg1);
    }

    @Given("^this is my second row value for second test \"([^\"]*)\"$")
    public void this_is_my_second_row_value_for_second_test(String arg1) throws Throwable {
        System.out.println(arg1);
    }
}
