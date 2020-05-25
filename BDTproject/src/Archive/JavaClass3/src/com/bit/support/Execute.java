package com.bit.support;

import org.openqa.selenium.By;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OpenBrowser op=new OpenBrowser();
		op.open();
		op.verifyTitle();
		op.verifyTitle("login page");
		//op.goToUrl();
		op.goToUrl("http://www.google.com");
		//op.typeEmail();
		op.typeEmail(By.id("email"), "myemail");
		//op.typePassword();
		op.typePassword("//input[@id='pass']", "mypass");
		//op.clickButton();
		op.clickButton(op.driver.findElement(By.id("u_0_2")));
	}
	/*
	DataType          Value
	ChromeDriver     new ChromeDriver();
	WebElement       driver.findElement(By.xpath("value of xpath"))
	By               Any locator like:  By.id("value of id") or By.xpath("value of xpath")
	List<WebElement>  driver.findElements(By.id(""))
	OpenBrowser      new OpenBrowser()
	*
	*/
	

}
