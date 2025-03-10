package com.ec.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ec.base.TestBase;

public class DataReadWrite extends TestBase {
	
	
	public static String path="C:\\Users\\monal\\eclipse-workspace\\E-commerceProject\\TestData\\data.xlsx";
	
	public static  String readData(int row, int col) throws IOException {
		
		File file = new File(path);
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		String s=sheet.getRow(row).getCell(col).getStringCellValue();
		
		
		return s;	
		
	}
	
	public void writeData(int row, int col, String value) throws IOException {
		File file= new File(path);
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		 sheet.createRow(row).createCell(col).setCellValue(value);
		
		
	}

}
