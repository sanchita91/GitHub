package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpBean {
	private String fName;
	private String lName;
	private int phone;private String email;
	private String pass;
	public SignUpBean(String fName, String lName, int phone, String email, String pass) {
		
		this.fName = fName;
		this.lName = lName;
		this.phone = phone;
		this.email = email;
		this.pass = pass;
	}
	WebDriver dr;
public void signUp() {
		dr.findElement(By.id("fname")).sendKeys(fName);
	}
	
	
	
//	public String getfName() {
//		return fName;
//	}
//	public void setfName(String fName) {
//		this.fName = fName;
//	}
//	public String getlName() {
//		return lName;
//	}
//	public void setlName(String lName) {
//		this.lName = lName;
//	}
//	public int getPhone() {
//		return phone;
//	}
//	public void setPhone(int phone) {
//		this.phone = phone;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPass() {
//		return pass;
//	}
//	public void setPass(String pass) {
//		this.pass = pass;
//	}
//	
//	

}
