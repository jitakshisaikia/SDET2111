package com.genericutil;

public interface AutoConstants 
/**
 * @author AMAR-G
 * All the Paths w.r.t. project will be available here
 */
{
	public static String DirPath = System.getProperty("user.dir");
	
	
	String propfile=DirPath+"/src/test/resources/CommonData.properties";
	String JSONfilepath=DirPath+"/SDET19.json";
	String XMLfilepath=DirPath+"/src/test/resources/CommonDAta.xml";
	String Excelpath=DirPath+"/src/test/resources/SDET_19.xlsx";
	String ExtentReportPath=DirPath+"/ExtentReports/Report_19";
	int timeforimplicitwait=10;
	int timeforexplicitwait=10;
}
