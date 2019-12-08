package com.qaminds.testget_apptive;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import com.qaminds.pages.BirthdayPage;
import com.qaminds.pages.CreatePswPage;
import com.qaminds.pages.GenderPage;
import com.qaminds.pages.IntroductionPage;
import com.qaminds.pages.PageJoinFB;
import com.qaminds.pages.PageName;
import com.qaminds.pages.PhonePage;

public class IntroductionTest extends BaseTest {
	
	
	public void validationTest() {
		System.out.println("validacion " + myDriver);		
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		introductionPage.selectButtonCreateAccount();
		
		PageJoinFB pageJoin = new PageJoinFB(myDriver);
		assertTrue(pageJoin.BtnNext());
		
		PageName yourNamePage = new PageName(myDriver);
		yourNamePage.insertFistName();
		yourNamePage.insertLastName();
		yourNamePage.clicBtnNext();
		
		PhonePage mobileNumberPage = new PhonePage(myDriver);
		mobileNumberPage.insertNumber();
		mobileNumberPage.clicBtnNext();
		
		BirthdayPage birthdayPage = new BirthdayPage(myDriver);
		birthdayPage.insertMonth();
		birthdayPage.insertDay();
		birthdayPage.insertYear();
		birthdayPage.clicBtnNext();
		
		GenderPage genderPage = new GenderPage(myDriver);
		genderPage.clickBtnSex();
		
		CreatePswPage passwordPage = new CreatePswPage(myDriver);
		passwordPage.insertPass();
		passwordPage.clickRegistrar();
	}
}
