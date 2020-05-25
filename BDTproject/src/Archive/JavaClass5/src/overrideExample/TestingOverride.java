package overrideExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingOverride {
	
	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("http://www.facebook.com");
		
	}

}
