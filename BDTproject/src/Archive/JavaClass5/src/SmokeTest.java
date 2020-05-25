import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseTest bs=new BaseTest();
		ChromeDriver driver=bs.openBrowser();
		FirefoxDriver dr;
		TestStep t=new TestStep(driver);
		TestStep t1=new TestStep(6);
		TestStep t2=new TestStep(9);
		/*
		t.isLogoPresent(driver);
		t.typeKidsOnSearchBox(driver);
		t.clickOnSearchButton(driver);
		t.verifyBirthTo24MonText(driver);
		t.clickOnBirtTo24MonOption(driver);
		t.getCountOfBirtTo24(driver);*/
		

		t.typeKidsOnSearchBox();
		t.clickOnSearchButton();
		t.verifyBirthTo24MonText();
		t.clickOnBirtTo24MonOption();
		t.getCountOfBirtTo24();
		bs.closeBrowser();
		
		
		
	}

}
