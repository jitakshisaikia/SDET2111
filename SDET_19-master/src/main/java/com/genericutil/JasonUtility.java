package com.genericutil;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JasonUtility {

	/**
	 * @author PAVAN
	 *  This method is going to read data from JSON 
	 * @param key (Data in JSON is stored in KEY and VAlue so pass key )
	 * @return  value (from json file)
	 * @throws IOException
	 * @throws ParseException
	 */
	public String readDataJSON(String key) throws IOException, ParseException
	{

		FileReader inputfile = new FileReader(AutoConstants.JSONfilepath);

		//Parsing the JSON into JAVA 
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(inputfile);

		//type cast the object and just read the data
		@SuppressWarnings("rawtypes")
		HashMap jobj = (HashMap) obj;

		String value = jobj.get(key).toString();

		return value;
	}
}
