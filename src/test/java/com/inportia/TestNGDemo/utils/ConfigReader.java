package com.inportia.TestNGDemo.utils;

public class ConfigReader {

    private static ConfigReader ourInstance = new ConfigReader();

    public static ConfigReader getInstance() {
        return ourInstance;
    }

    private ConfigReader()
    {

    }
}
