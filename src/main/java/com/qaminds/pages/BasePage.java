package com.qaminds.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import io.appium.java_client.pagefactory.AndroidFindBy;

public class BasePage {
	
	private AndroidDriver<AndroidElement> driver;
	
	private final WebDriverWait wait;
	//implicit: es para determinado tiempo de espera (10, 20, 30 seg)
	//explicit: es cuando espera que una condicion suceda 
	//fluent: es para que espere aunque mande un error de que todavia no aparece siga esperando
		
	public BasePage(MyDriverAppium driver) {
		this.wait = new WebDriverWait(driver.getDriver(), 10);
		this.driver = driver.getDriver();
	}
	public AndroidDriver<AndroidElement> getDriver(){
		return driver;		
	}
	
	public WebDriverWait getWait() {
		return wait;
	}
	public void waitVisibility(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
	}
		
	public void selectBtn(AndroidElement elem) {
		elem.click();
	}
	

}
