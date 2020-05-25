package Utils;

import org.openqa.selenium.WebElement;

public class SeleniumHelper {

	public static void type(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public static void click(WebElement element) {
		element.click();;
	}
	
	public static boolean verifyText(WebElement element,String text) {
		return element.getText().equals(text);
		
	}
}
