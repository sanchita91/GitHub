import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	ChromeDriver driver;
	
	int a=76;
	public ChromeDriver openBrowser() {
		
		if(driver==null)
		{
		driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		}
		return driver;
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
