package overrideExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver extends MyRemoteWebdriver{

	WebDriver driver;
	MyChromeDriver(){
		driver=new ChromeDriver();
	}
	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
}
