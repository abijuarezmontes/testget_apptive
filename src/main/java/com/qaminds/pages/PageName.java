package com.qaminds.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class PageName extends BasePage {

	public PageName(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private final String txt_firstName = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[1]";
	private final String txt_lastName = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[2]";
	private final String btn_next = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";
	
	public void insertFistName() {
		AndroidElement FirstName = getDriver().findElementByXPath(txt_firstName);
		FirstName.sendKeys("Abi");
	}
	
	public void insertLastName() {
		AndroidElement LastName = getDriver().findElementByXPath(txt_lastName);
		LastName.sendKeys("Juarez");
	}
	
	public void clicBtnNext() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btn_next)));
		System.out.println("clic al boton next");
		AndroidElement btnNext = getDriver().findElementByXPath(btn_next);
		btnNext.click();
	}
	
	
}
