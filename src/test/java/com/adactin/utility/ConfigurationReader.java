package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws IOException {
		File file = new File(".//src//test//java//com//adactin//properties//Adactin.properties"); // Using data driven
																									// we get data from
																									// Adactin.properties
																									// file
		FileInputStream fis = new FileInputStream(file); // create constructor as we can't give fi/pstream inside class
		p = new Properties();
		p.load(fis); // now our property file is loaded
	}

	public String getBrowsername() {
		String browsername = p.getProperty("browsername");
		//System.out.println(browsername);
		return browsername;
	}

	public String getUrl() {
		String url = p.getProperty("url");
	//	System.out.println(url);
		return url;
	}

	}
