package com.practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_ExcelSheet {

	public static void main(String[] args) throws Throwable 
	{

		FileInputStream fis = new FileInputStream("../SDET_19/src/test/resources/SDET_19.xlsx");

		String  value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		
		System.out.println(value);
//
//		Sheet sh = wb.getSheet("Sheet1");
//
//		int row = sh.getLastRowNum();
//		
//		System.out.println(row);
//		
//
////		Cell cell = row.getCell(0);
////
////		String  value = cell.getStringCellValue();
////		
////		System.out.println(value);

	}

}
