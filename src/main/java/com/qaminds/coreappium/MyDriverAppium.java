package com.qaminds.coreappium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyDriverAppium {
	
	Logger logger = Logger.getLogger(MyDriverAppium.class);
	
	
	protected AndroidDriver<AndroidElement> driver;
	protected WebDriverWait wait;
	
	public void setUpAppiumDriver() {
		DesiredCapabilities cap = new DesiredCapabilities();
		final File appDirectory = new File("/Users/Magal/OneDrive/Documentos/Curso Appium/facebook_lite_v172.0.0.11.116.apk");

		cap.setCapability("app", appDirectory.getAbsolutePath());
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("clearSystemFiles", true);
		cap.setCapability("noReset", true);
	    cap.setCapability("autoGrantPermissions", true);
	    cap.setCapability("noReset", true);
	    cap.setCapability("clearSystemFiles", true);
	
		try {
			
			driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			wait = new WebDriverWait(driver,10);
			
			
		}catch(MalformedURLException e) {
			logger.error("error mydriverandroid",e);
		}
	}

	public AndroidDriver<AndroidElement> getDriver() {
		return driver;
	}
	
}
