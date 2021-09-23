package com.practice;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.genericutil.ExcelUtility;

public class DataProvider_1 
{
	ExcelUtility excel = new ExcelUtility();
	
	@Test(dataProvider = "getValues")
	public void readDAta(String s1, String s2) 
	{
		System.out.println(s1+" "+s2 );
	}


	@DataProvider
	public Object[][] getValues() throws EncryptedDocumentException, IOException {
		Object[][] objArr = new Object[5][2];

		objArr[0][0] =excel.readDataExcel("Sheet2", 0, 0);
		objArr[0][1] = "GOI";

		objArr[1][0] = "BLR";
		objArr[1][1] = "NYC";


		objArr[2][0] = "BLR";
		objArr[2][1] = "NCL";


		objArr[3][0] = "BLR";
		objArr[3][1] = "NTL";

		objArr[4][0] = "BLR";
		objArr[4][1] = "EWR";
		return objArr;

	}
}
