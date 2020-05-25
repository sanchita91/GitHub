package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=null;
		A x=new A();
		int y=x.m1(9)*7;
		x.m2("hello").length();
		x.m2("hello").concat("7");
		System.out.println(y);
		boolean v=x.m3();
		x.m8(driver).click();
		x.m8(driver).sendKeys("");
		x.m9(driver, By.xpath("xpath of userid")).sendKeys("");;
		x.m9(driver, By.xpath("xpath of pass")).sendKeys("");
		x.m9(driver, By.xpath("xpath of login")).getText();
		x.m9(driver, By.xpath("xpath of login")).isEnabled();
		x.m9(driver, By.xpath("xpath of login")).click();
		x.m5().m6(driver);
		x.m4().findElement(By.id(""));
	}
	

//1.if value and action is fixed then method will be void and no parameter
	void cagol() {}
//2.if value is not fixed and action is fixed then method will be void 
	//and parameter
	void pagol(WebElement e) {}
//3.if value is  fixed and action is not fixed then method will be return 
	//type
	//and no parameter
		//WebElement bodai() {}
//4.if value is not fixed and action is not fixed then method will be return type
		//and  parameter
		//	WebElement moga(By by) {}
		
	
	
	
	
	
	
	
	
	
	
}
