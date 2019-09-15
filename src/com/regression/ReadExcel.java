package com.regression;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("E:\\Selenium Drivers\\TestDataSheet.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); //XSSFWork book for xlsx, HSSFWorkbook for xls
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		String data2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Value from sheet: " + data1);
		
		System.out.println("Value from sheet: " + data2);
		
		wb.close();

	}

}
