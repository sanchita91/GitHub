package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {

	WebDriver dr;
	public void openBrowser(String b) {
		if(b.equals("chrome"))
		{
		dr=new ChromeDriver();
		}
		else if(b.equals("firefox"))
		{
		dr=new FirefoxDriver();
		}
		else if(b.equals("ie"))
		{
		dr=new InternetExplorerDriver();
		}
		 
	}
	public HomePage gotoUrl() {
		 dr.get("http://www.facebook.com");
		 return new HomePage(dr);
	}
	
}
