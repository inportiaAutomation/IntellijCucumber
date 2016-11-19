package com.inportia.TestNGDemo.utils;


import jxl.Workbook;
import jxl.write.WritableWorkbook;

import java.io.File;

public class ExcelManager
{
     static WritableWorkbook workbook;

     public static WritableWorkbook create_excel_sheet(String name)
     {
         try
         {
             workbook = Workbook.createWorkbook(new File(name));
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }

         return workbook;
     }

     public static void  set_data(int row,int col)
     {

     }
}
