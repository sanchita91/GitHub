import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {
	public static boolean isElementPresent(WebElement element) {
		return element.isDisplayed();
		
	}
	public static boolean isElementPresent(ChromeDriver driver,By by) {
		return driver.findElement(by).isDisplayed();
		
	}
	
	public static void typeOnTextBox(WebElement element,String text) {
		element.clear();
		element.sendKeys(text);
		
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
		
	}
	
	public static void clickOnElement(List<WebElement> elements,int index) {
		elements.get(index).click();
		
	}
	
	public static boolean verifyText(WebElement element,String exText)
	{
		return element.getText().equals(exText);
	}
	
	public static int getCountOfElements(List<WebElement> elements) {
		return elements.size();
		
	}
	
	

}
