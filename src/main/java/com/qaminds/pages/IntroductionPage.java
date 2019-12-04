package com.qaminds.pages;

import org.openqa.selenium.By;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage {
	
	public IntroductionPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String titleIntroductionId = "section_label";
	public final String nextBtn = "intro_btn_next";
	public final String skipBtn = "intro_btn_skip";
	
	public boolean getTitleIntroduction() {
		System.out.println("llegas al metodo" + titleIntroductionId);
		AndroidElement titleIntroduction = getDriver().findElementById(titleIntroductionId);
		System.out.println("y Pintas esto " + titleIntroduction.getText());
		return titleIntroduction.isDisplayed();
	}
	
	public void moveOnboarding() {
		super.waitVisibility(By.id(nextBtn));
		super.selectBtn(getDriver().findElementById(nextBtn));
		selectBtn(getDriver().findElementById(skipBtn));
	}
	
	
	
	
	

}
