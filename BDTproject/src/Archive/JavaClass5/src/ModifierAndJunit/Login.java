package ModifierAndJunit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	public void login(String user,String pass) {
		
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("email")).sendKeys(pass);
	}

}
