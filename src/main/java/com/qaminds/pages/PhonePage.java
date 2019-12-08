package com.qaminds.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class PhonePage extends BasePage{

	public PhonePage(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private final String txt_number = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView";
	private final String btn_next = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup";
	
	public void insertNumber() {
		AndroidElement inputNumber = getDriver().findElementByXPath(txt_number);
		inputNumber.clear();
		inputNumber.sendKeys("5541871959");
	}
	
	public void clicBtnNext() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btn_next)));
		System.out.println("Selecciona el botón next");
		AndroidElement btnNext = getDriver().findElementByXPath(btn_next);
		btnNext.click();
	}

	
}
