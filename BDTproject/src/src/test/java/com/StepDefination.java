package com;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.SeleniumHelper;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefination {
	BaseTest b;
	HomePage h;
	ProfilePage p;
	
	@Before
	public void start() {
		System.out.println("1");
	}
	@After
	public void end() {
		System.out.println("2");
	}
	@Before("@Reg")
	public void start1() {
		System.out.println("3");
	}
	@After("@reg")
	public void end1() {
		System.out.println("4");
	}
	
	
	
//	@Given("^open chrome browser$")
//	public void open_chrome_browser() throws Throwable {
//	  b=new BaseTest();
//	 // b.openBrowser();
//	}
	
	@Given("^open browser$")
	public void open_browser(DataTable arg1) throws Throwable {
	List<List<String>>  browsers=arg1.raw();
	String browser=browsers.get(0).get(1);
	b=new BaseTest();
 b.openBrowser(browser);
	    
	}

	@Given("^go to url$")
	public void go_to_url() throws Throwable {
	    h=b.gotoUrl();
	}

	@When("^user type email in user text box$")
	public void user_type_email_in_user_text_box() throws Throwable {
	   h.typeUserId("myemailid");
	}

	@When("^user type password in paaword text box$")
	public void user_type_password_in_paaword_text_box() throws Throwable {
		h.typePass("MyPass");
	}

	@When("^user click in login button$")
	public void user_click_in_login_button() throws Throwable {
	p=h.clickLoginButton();
	}

	@Then("^user should nevigate to profile page$")
	public void user_should_nevigate_to_profile_page() throws Throwable {
	  p.verifyName();
	}

	@When("^user type <\"([^\"]*)\"> in user text box$")
	public void user_type_in_user_text_box(String arg1) throws Throwable {
		h.typeUserId(arg1);
	}
	@When("^user type <\"([^\"]*)\"> in paaword text box$")
	public void user_type_in_paaword_text_box(String arg1) throws Throwable {
		h.typePass(arg1);
	}

	@Then("^user should not be nevigated to profile page$")
	public void user_should_not_be_nevigated_to_profile_page() throws Throwable {
		 Assert.assertFalse(p.verifyName());
	}
}
