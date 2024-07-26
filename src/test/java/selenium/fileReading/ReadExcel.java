package selenium.fileReading;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String args[]) throws IOException {

		// Locate the file

		String fileLocation = ".\\src\\test\\resources\\TestData\\CreateLead.xlsx";

		// Locate the workbook & Sheet
		

	XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		    
	XSSFSheet sheet  = 	wbook.getSheet("register");
				
		// Read the data from the cell (Rows & Column)
		
			XSSFRow row = sheet.getRow(1);
				
			XSSFCell cell = row.getCell(0);
			
				
		String value = cell.getStringCellValue();
		
		System.out.println(value);
		
		wbook.close();
		 		 
	}
	
	
	/*
	 * //Read the data from the cell (Rows & Column) 
	 * for (int i = 1; i <= 2; i++) {
	 * XSSFRow row = sheet.getRow(i); 
	 * for (int j = 0; j < 2; j++) {
	 *  XSSFCell cell = row.getCell(j); 
	 *  String value = cell.getStringCellValue();
	 *  System.out.println(value); 
	 *  } 
	 *  wbook.close();
	 * 
	 */

	// Close the resource

}
