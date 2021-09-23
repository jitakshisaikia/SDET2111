package com.practice;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.genericutil.ExcelUtility;

public class DataProvider_Excel 
{
	ExcelUtility excel = new ExcelUtility();
	@Test(dataProvider = "getvalues")
	public void sdet(String s1,String s2)
	{
		System.out.println(s1+" "+s2);
	}

	@DataProvider
	public Object[][] getvalues() throws EncryptedDocumentException, IOException 
	{
		int  lastrow=	excel.getlastrow();
		Object[] [] arr = new  Object[lastrow+1] [2];
		for (int i = 0; i < lastrow+1; i++)
		{
			arr[i][0]= excel.readDataExcel("Sheet2", i, 0);
			arr[i][1]= excel.readDataExcel("Sheet2", i, 1);
		}
		return arr;
	}
}
