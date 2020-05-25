package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.SeleniumHelper;

public class ProfilePage {

	WebDriver dr;
	public  ProfilePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		dr=driver;
		PageFactory.initElements(dr, this);
	}
	@FindBy(id="name") WebElement namefield;
	public boolean verifyName() {
		boolean result=SeleniumHelper.verifyText(namefield, "shaidul");
		System.out.println(result);
		return result;
	}
}
