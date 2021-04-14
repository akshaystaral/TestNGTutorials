package udemydemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadandWriteExcel {

	public static void main(String[] args) {
		
		try 
		{	
			//Specify File path
			File src = new File("A:\\TestDocument.xlsx");
			//Load File
			FileInputStream fis = new FileInputStream(src);
			//Load Workbook
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			//Load Sheet 1
            XSSFSheet sh1= wb.getSheetAt(0);
            // getRow() specify which row we want to read.
            // and getCell() specify which column to read.
            // getStringCellValue() specify that we are reading String data.

            System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());

		}
	}

}
