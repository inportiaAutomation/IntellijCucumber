package com.inportia.TestNGDemo;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOne {

       @Test
       public void testcase_a()
       {
              System.out.println("inside testcase_a");
       }

       @Test(dataProvider = "data_generator")
       public void testcase_b(int n , String name)
       {
           System.out.println(n + " : "+name);
       }

       @DataProvider
       public Object[][] data_generator()
       {
              Object[][] data = new Object[2][2];
              data[0][0] = 1;
              data[0][1] = "user_a";
              data[1][0] = 2;
              data[1][1] = "user_b";
              return data;
       }


}
