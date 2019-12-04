package com.qaminds.testget_apptive;

import java.util.ResourceBundle;

import javax.annotation.Resource;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

import com.qaminds.coreappium.MyDriverAppium;

public class BaseTest {
	
	MyDriverAppium myDriver = new MyDriverAppium();
	private static Logger log = Logger.getLogger(BaseTest.class);
	
	private ResourceBundle resource = ResourceBundle.getBundle("propertiesConfig");
	
	@BeforeSuite
	public void chargeDriver() {
		try {
			myDriver.setUpAppiumDriver();
		}catch(Exception e) {
			log.error("ocurrio un error en BaseTest.chargeDriver()");
		}
	}
	
	@AfterSuite
	public void finishDriver() {
		/*if(myDriver != null) {
			myDriver.getDriver().quit();
		}*/
	}
	
	public String getProperty(String key) {
		return resource.getString(key);
	}

}
