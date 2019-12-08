package com.qaminds.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage {
	
	public IntroductionPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String createAccount = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup";

	public void selectButtonCreateAccount() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createAccount)));
		System.out.println("Selecciona botón crear nueva cuenta");
		AndroidElement Create_account = getDriver().findElementByXPath(createAccount);
		Create_account.click();
	}
}
