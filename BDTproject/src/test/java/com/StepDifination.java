package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//System.setProperty("webdriver.chrome.driver", "/Users/sanchita/Downloads/chromedriver");


public class StepDifination {
	WebDriver dr;
	@Given("^open chome browser$")
	public void open_chome_browser() throws Throwable {
		   System.setProperty("webdriver.chrome.driver", "/Users/sanchita/Downloads/chromedriver");
            dr= new ChromeDriver(); 
	   
	}

	@Given("^go to url$")
	public void go_to_url() throws Throwable {
	    dr.get("https://www.facebook.com/");
	}

	@When("^user type email in user text box$")
	public void user_type_email_in_user_text_box() throws Throwable {
	    dr.findElement(By.xpath("//input[@id='email']")).sendKeys("sanchitausa@yahoo.com");
	}

	@When("^user type password in password text box$")
	public void user_type_password_in_password_text_box() throws Throwable {
	    dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("pinke");
	}
	@When("^user should click the click button$")
	public void user_should_click_the_click_button() throws Throwable {
	    dr.findElement(By.xpath("//input[@id='u_0_2']")).click();
	}
	
     @Then("^user should nevigate to profile page$")
	public void user_should_nevigate_to_profile_page() throws Throwable {
	  // Assert.assertFalse(dr.getCurrentUrl().equals("https://www.facebook.com/"));
	}
	@When("^user type \"([^\"]*)\" in user text box$")
	public void user_type_in_user_text_box(String arg1) throws Throwable {
	    dr.findElement(By.xpath("//input[@id='u_0_2']")).sendKeys(arg1);
	}

	@When("^user type \"([^\"]*)\" in password text box$")
	public void user_type_in_password_text_box(String arg1) throws Throwable {
		dr.findElement(By.xpath("//input[@id='u_0_2']")).sendKeys(arg1);
	   
	}

}
