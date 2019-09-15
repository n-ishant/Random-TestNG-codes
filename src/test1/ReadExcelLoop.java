package test1;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelLoop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("E:\\Selenium Drivers\\TestDataSheet.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); //XSSFWork book for xlsx, HSSFWorkbook for xls
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount =sheet1.getLastRowNum();
		System.out.println("Row count = "+ rowcount);
		
		for(int i=0; i<=rowcount; i++)
		{
			String data0= sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Value from sheet: " + data0);
		}
		
		wb.close();

	}

}
