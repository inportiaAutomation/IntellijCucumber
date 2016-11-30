package com.inportia.TestNGDemo.utils;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelManager
{
     static WritableWorkbook workbook;
     static String save_location = System.getProperty("user.dir") + "\\src\\test\\java\\com\\inportia\\TestNGDemo\\utils\\data\\";;
     


     public static WritableWorkbook create_excel_sheet(String name)
     {
         try
         {
        	 System.out.println("Creating excel sheet named "+name);
             workbook = Workbook.createWorkbook(new File(save_location+name));
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }

         return workbook;
     }

     public static void  set_data(int row,int col,String excelName)
     {
          
     }
     
     public static String get_data(int row,int col, String excelName) throws BiffException, IOException
     {
    	 String cell_row0_col0 = null;
    	 try
    	 {
    	 String path = save_location + excelName;
    	 FileInputStream file_obj = new FileInputStream(path);
    	 Workbook work_book = Workbook.getWorkbook(file_obj);
    	 Sheet sheet_one = work_book.getSheet(0);
    	 cell_row0_col0 = sheet_one.getCell(0,0).getContents();
    	 }
    	 catch(Exception ex)
    	 {
    		 
    	 }
    	 return cell_row0_col0;
     }
}
