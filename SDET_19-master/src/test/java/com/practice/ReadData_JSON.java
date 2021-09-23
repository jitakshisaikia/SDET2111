package com.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadData_JSON {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader inputfile = new FileReader("../SDET_19/SDET19.json");
		
		//Parsing the JSON into JAVA 
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(inputfile);
		
		//type cast the object and just read the data
		HashMap jobj = (HashMap) obj;
		
		String value = jobj.get("username").toString();
		
		System.out.println(value);
		
	}

}
