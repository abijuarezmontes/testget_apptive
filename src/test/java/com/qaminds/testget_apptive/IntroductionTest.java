package com.qaminds.testget_apptive;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import com.qaminds.pages.FormularioPage;
import com.qaminds.pages.IntroductionPage;

public class IntroductionTest extends BaseTest {
	
	
	@Test(testName = "Prueba Onboarding Apptive" /*, groups = {"group1"}, priority =1*/ )
	public void validationTest() {
		System.out.println("muestrame que sirves " +getProperty("get_apptive"));
		System.out.println("Se hace una prueba ... "+myDriver);
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		//assertFalse(introductionPage.getTitleIntroduction());
		assertTrue(introductionPage.getTitleIntroduction());
		introductionPage.moveOnboarding();
	}
	
	@Test(groups = {"group2"}, priority = 3)
	public void llenaFormularioTest() {
		System.out.println("llena formulario... " +myDriver);
		FormularioPage formulario = new FormularioPage (myDriver);
		formulario.insertName();
		formulario.insertHeigth();
		formulario.insertWeigth();
	}
	
	/*
	@Test(groups = {"group2"}, priority = 3)
	public void validationTitltIntroduction3() {
		System.out.println("grupo 2, prioridad 3");
	}
	
	@Test(groups = {"group2"}, priority = 1)
	public void validationTitltIntroduction() {
		System.out.println("grupo 2, prioridad 1");
	}
	
	@Test(groups = {"group2"}, priority = 2)
	public void validationTitltIntroduction2() {
		System.out.println("grupo 2, prioridad 2");
}*/
}
