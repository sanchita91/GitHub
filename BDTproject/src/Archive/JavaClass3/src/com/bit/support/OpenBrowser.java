package com.bit.support;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	ChromeDriver driver;

	public void gettAllMethodFromChromDriverClass() {

		/*
		 * Return Type methodName purpose void get() nevigate to url WebElement
		 * findelement() to find one element List<WebElement> findElements() to find
		 * more than one element void sendKeys() to type void click()/submit() to click
		 * on element void clear() to clear text box String getTitle() to get title
		 * value String getPageSource() to get page view source html file String
		 * getCurrentUrl() to get current page url String getText() to get text from
		 * element String getattribute() to get attribute value of element boolean
		 * isDisplayed() to verify element present or not boolean isSelected () to
		 * verify check box is selected or not boolean isEnabled() to check element
		 * enabled or not boolean equals() to compare two object value boolean
		 * contains() to see partial value
		 */

	}

	public void open() {
		// System.setProperty("webdriver.chrome.driver","/Users/bittechconsulting/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	public void add(int a, int b) {
		int c = a + b;
	}

	public void goToUrl() {
		// driver.get("http://www.facebook.com");
		driver.get("https://www.facebook.com/");
	}

	public void goToUrl(String url) {
		// driver.get("http://www.facebook.com");
		driver.get(url);
	}

	public void typeEmail(By x, String text) {
		driver.findElement(x).sendKeys(text);

	}

	public void typeEmail() {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("myemail");

	}

	public void typePassword() {
		driver.findElement(By.id("pass")).sendKeys("mypassword");
	}

	public void typePassword(String p, String text) {
		driver.findElement(By.xpath(p)).sendKeys(text);
	}

	public void clickButton() {
		driver.findElement(By.id("u_0_2")).click();
	}

	public void clickButton(WebElement e) {
		e.click();
	}

	public void verifyTitle() {
		boolean b = driver.getTitle().equals("Facebook home page");
		System.out.println(b);
	}

	public void verifyTitle(String title) {
		boolean b = driver.getTitle().equals(title);
		System.out.println(b);
	}

	public void isElementpresent() {
		boolean b = driver.findElement(By.xpath("logoxpath")).isDisplayed();
		System.out.println(b);
	}

	public void isElementpresent(By x) {
		boolean b = driver.findElement(x).isDisplayed();
		System.out.println(b);
	}

	public void verifyText() {
		String value = driver.getPageSource();
		boolean b = value.contains("shahidul");
		System.out.println(b);

	}

	public void verifyText(String text) {
		String value = driver.getPageSource();
		boolean b = value.contains(text);
		System.out.println(b);

	}

	public void isTextBoxselected() {
		boolean b = driver.findElement(By.xpath("")).isSelected();
		System.out.println();
	}

	public void isTextBoxselected(By x) {
		boolean b = driver.findElement(x).isSelected();
		System.out.println();
	}

	public void isButtonEnable() {
		boolean b = driver.findElement(By.xpath("")).isEnabled();
		System.out.println(b);
	}

	public void isButtonEnable(WebElement e) {
		boolean b = e.isEnabled();
		System.out.println(b);
	}

	public void verifyTextValueOfElement() {
		String value = driver.findElement(By.xpath("")).getText();
		boolean b = value.equals("Log In");
		System.out.println(b);
	}

	public void verifyTextValueOfElement(By x) {
		String value = driver.findElement(x).getText();
		boolean b = value.equals("Log In");
		System.out.println(b);
	}

	public void verifyAttributeValueOfElement() {
		String value = driver.findElement(By.xpath("")).getAttribute("title");
		boolean b = value.equals("facebook log in");
		System.out.println(b);
	}

	public void verifyAttributeValueOfElement(By x, String attr) {
		String value = driver.findElement(x).getAttribute(attr);
		boolean b = value.equals("facebook log in");
		System.out.println(b);
	}

	public void getMoreThanoneElement() {
		List<WebElement> elements = driver.findElements(By.xpath(""));
	}

	public void getMoreThanoneElement(List<WebElement> elements, int i) {
		elements.get(i).click();
	}

}
