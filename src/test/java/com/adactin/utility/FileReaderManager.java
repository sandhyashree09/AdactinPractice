package com.adactin.utility;

import java.io.IOException;

public class FileReaderManager {
	
	//private empty constructor will not allow obj creation in any other places
	private FileReaderManager() { //created empty constructor to use the obj only in this class
	}

	public static FileReaderManager getFRMInstance() { //obj f is created for this class to call obj cr of ConfigurationReader (this class)...It should be static
FileReaderManager f = new FileReaderManager();
return f;
	}
	
	public ConfigurationReader getCRInstance() throws IOException { //coniguration reader we haved created obj to call method from configuration reader class
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}

	}
	
