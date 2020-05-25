package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.A;

public class ATest {
	ChromeDriver driver;
	@Test
	public void test() {
		A x=new A();
		x.m1();
		// single statement
		/*//==   ---->equal
		>=   greater than equal
		<=   less than equal
		!=    not equal
		&&   and
		||     or
		
		*
		*/
		if(6+9<75)
		{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//selenium example
		
		if(driver.findElement(By.id("")).isDisplayed())
		{
			driver.findElement(By.id("")).click();
		}else {
			System.out.println("element not visible");
		}
		//multiple statement
		int age=6;
		if(age==6)
		{
			System.out.println("he is in first grade");
		}else if(age>=6&&age<10)
		{
			System.out.println("no more kids");
		}else if(age<5)
		{
			System.out.println("he is getting ready for school");
		}else
		{
			System.out.println("out of boundary");
		}
		
		//selenium
		
		
		if(driver.findElement(By.id("")).getText().equals("hi"))
		{
			System.out.println("he is in first grade");
		}else if(driver.getTitle().equals("hello"))
		{
			System.out.println("no more kids");
		}else if(driver.findElement(By.id("")).isSelected())
		{
			System.out.println("he is getting ready for school");
		}else
		{
			System.out.println("out of boundary");
		}
		
		//multiple statement using switch case
		String result=null;
		switch(result)
		{
		case  "pass":
		{
			System.out.println("test case passed");
			break;
		}case "Failure":
		{
			System.out.println("test case failed");
			break;
		}case "skip":
		{
			System.out.println("skipped");
			break;
		}
		default:
		{
			System.out.println("nothing match");
		}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
