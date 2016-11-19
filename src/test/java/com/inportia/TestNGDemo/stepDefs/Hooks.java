package com.inportia.TestNGDemo.stepDefs;



import cucumber.api.java.*;

public class Hooks
{

    @Before
    public static void set_up()
    {
        System.out.println("\n [hooks] this is inside the setup method");
    }

    @After
    public static void tear_down()
    {
        System.out.println("\n [hooks] this is inside the teardown method");
    }

}
