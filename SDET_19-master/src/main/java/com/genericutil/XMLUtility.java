package com.genericutil;

import java.io.File;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class XMLUtility {

	/**
	 * Read the data from XML file
	 * @param node
	 * @return Value from XML 
	 * @throws DocumentException
	 */
	public String readDatafrom_XML(String node) throws DocumentException 
	{

		File inputfile = new File(AutoConstants.XMLfilepath);
		SAXReader reader = new SAXReader();
		Document doc = reader.read(inputfile);
		String value = doc.selectSingleNode(node).getText();

		return value;
	}

}
