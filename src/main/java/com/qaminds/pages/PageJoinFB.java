package com.qaminds.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class PageJoinFB extends BasePage {

	public PageJoinFB(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public final String btn_next = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup";
	
	public boolean BtnNext() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btn_next)));
		System.out.println("Clic sobre botón siguiente");
		AndroidElement btnNext = getDriver().findElementByXPath(btn_next);
		btnNext.click();
		return btnNext.isDisplayed();
	}
}
