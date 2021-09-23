package com.practice;

import org.testng.annotations.Test;

public class ReadData_CMD_Test {

@Test
public void takeDatafromCMD()
{

		String URL=System.getProperty("url");
		String PWD=System.getProperty("pwd");
		String USERNAME=System.getProperty("un");

		System.out.println(URL);
		System.out.println(PWD);
		System.out.println(USERNAME);

	}

}
