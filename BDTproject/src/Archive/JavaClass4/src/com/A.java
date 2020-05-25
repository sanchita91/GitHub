package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	
	public int m1(int a) {
		System.out.println(a);
		return 6;
		
	}
	public int m1(ChromeDriver driver ){
		List<WebElement> elements=driver.findElements(By.id(""));
		
		return elements.size();
		
	}
	
	public String m2(String a) {
		System.out.println(a);
		
		return "6";
		
	}
	
	public String m2(ChromeDriver driver) {
		//return driver.getTitle();
		return driver.findElement(By.xpath("")).getText();
		
		
	}
	
	public boolean m3() {
		System.out.println(8);
		
		return 8>9;
		
	}
	
	
	public boolean m3(ChromeDriver driver) {
		String t= driver.findElement(By.xpath("")).getText();
		boolean b= driver.findElement(By.xpath("")).isDisplayed();
		return b;
				//return t.equals("Silk Saree");
		
		
	}
	
	public ChromeDriver m4() {
		return new ChromeDriver();
	}
	public A m5() {
		return new A();
	}
	
	public List<WebElement> m6(ChromeDriver driver) {
		return driver.findElements(By.xpath(""));
	}
	public WebElement m8(ChromeDriver driver) {
		return driver.findElement(By.xpath(""));
	}
	
	public WebElement m9(ChromeDriver dr,By b) {
		return dr.findElement(b);
	}
	
	//By type also
	
	
	
	
	
	

}
