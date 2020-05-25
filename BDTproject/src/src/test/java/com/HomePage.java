package com;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.SeleniumHelper;
import cucumber.api.DataTable;

public class HomePage {
	WebDriver dr;
	public  HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		dr=driver;
		PageFactory.initElements(dr, this);
	}

	@FindBy(id="email") WebElement emailBox;
	@FindBy(id="pass") WebElement passBox;
	@FindBy(id="u_0_2") WebElement loginButton;
	public void typeUserId(String text)
	{
		SeleniumHelper.type(emailBox, text);
	}
	public void typePass(String text)
	{
		SeleniumHelper.type(passBox, text);
	}
	public ProfilePage clickLoginButton() {
		SeleniumHelper.click(loginButton);
		return new ProfilePage(dr);
	}
	
	public void user_enters_testuser_and_Test(WebElement element,DataTable arg1) throws Throwable {
		 
		 //Write the code to handle Data Table
		 List<Map<String,String>> data = arg1.asMaps(String.class,String.class);
		
		 element.sendKeys(data.get(0).get("userid")); 
	    element.sendKeys(data.get(0).get("password"));
	       
	
	
	
	
	
	
	}
	
	
}
