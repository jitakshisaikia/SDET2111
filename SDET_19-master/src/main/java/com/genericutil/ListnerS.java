package com.genericutil;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerS  implements ITestListener  {


	ExtentReports reports; //attch the reporter
	ExtentTest test; //to make entries of test cases and logs
	@Override
	public void onTestStart(ITestResult result) 
	{
		test=reports.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+" is Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+" is Failed");
		test.log(Status.FAIL, result.getThrowable());

		try {
			String path = BaseClass.getscreenshot(result.getName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+"Skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		JavaUtil jv = new JavaUtil();
		String date=jv.getCurrentDate();
		ExtentHtmlReporter reporter; //Path of report and we can make change to look and feel of report
		reporter= new ExtentHtmlReporter(AutoConstants.ExtentReportPath+date+".html");
		reporter.config().setDocumentTitle("SDET19");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Regression");

		reports= new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("AppURL", "http://localhost:8888");
		reports.setSystemInfo("Env", "Test QA");
		reports.setSystemInfo("Build", "2.1");
		reports.setSystemInfo("Reporter name", "Pavan");

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		reports.flush();
	}

}
