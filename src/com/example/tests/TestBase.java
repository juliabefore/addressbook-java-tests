package com.example.tests;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.logging.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.example.fw.ApplicationManager;

public class TestBase {
	
	protected static ApplicationManager app;
	protected Logger log = Logger.getLogger("TEST");

	/*
	@BeforeClass
	@Parameters({"configFile"})
	public void setUp(@Optional String configFile) throws Exception{
		if(configFile == null){
			configFile = System.getProperty("configFile");
		}
		if(configFile == null){
			configFile = System.getenv("configFile");
		}
		if(configFile == null){
			configFile = "application.properties";
		}
		Properties properties = new Properties();
		properties.load(new FileReader("configFile"));
		log.info("setUp start");
		app = ApplicationManager.getInstance();
		app.setProperties(properties);
		log.info("setUp end");
	}
	*/
	@BeforeTest
	public void setUp() throws Exception {
		String configFile = System.getProperty("configFile", "application.properties");
		Properties properties = new Properties();
		properties.load(new FileReader(new File(configFile)));
		app = ApplicationManager.getInstance();
		app.setProperties(properties);
	    
	  }
		
	@AfterTest
	public void tearDown() throws Exception {
		log.info("tearDown start");
	    app.stop();
	    log.info("tearDown end");
	}
	
	
}
