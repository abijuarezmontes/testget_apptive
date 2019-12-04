package com.qaminds.pages;

import java.awt.List;

import org.openqa.selenium.By;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class FormularioPage extends BasePage {

	public FormularioPage(MyDriverAppium driver) {
		super(driver);
	}

	public final String textFielName = "input_name";
	public final String textFielHeight = "input_height";
	public final String textFielWeight = "input_weight";
	public final String comboSex = "input_sex";
	public final String comboAge = "input_age";
	public final String comboGoal = "input_goal";
	public final String contenidoComboText = "FrameLayout";

	public boolean insertName() {
		System.out.println("Ingresa nombre");
		super.waitVisibility(By.id(textFielName));
		AndroidElement TextName = getDriver().findElementById(textFielName);
		TextName.sendKeys("Abi");
		return TextName.isDisplayed();
	}

	public boolean insertHeigth() {
		System.out.println("Ingresa altura");
		super.waitVisibility(By.id(textFielHeight));
		AndroidElement TextHeigth = getDriver().findElementById(textFielHeight);
		TextHeigth.sendKeys("1.65");
		return TextHeigth.isDisplayed();
	}

	public boolean insertWeigth() {
		System.out.println("Ingresa peso");
		super.waitVisibility(By.id(textFielWeight));
		AndroidElement textWeight = getDriver().findElementById(textFielWeight);
		textWeight.sendKeys("68");
		return textWeight.isDisplayed();
	}

	public boolean selectSex() {
		System.out.println("Ingresa sexo");
		
		return false;
	}
}
