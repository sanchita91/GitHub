import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestStep {
	ChromeDriver driver;
	int x;
	WebElement ele=driver.findElement(By.xpath("logo xpath"));
	
	public TestStep(int a) {
		// TODO Auto-generated constructor stub
		x=a;
	}
	
	public TestStep(ChromeDriver dr)
	{
		driver=dr;	
	}
	/*public void isLogoPresent(ChromeDriver driver) {
		boolean result=Shared.isElementPresent(ele);
		System.out.println(result);
	}

	public void typeKidsOnSearchBox(ChromeDriver driver) {
		Shared.typeOnTextBox(driver.findElement(By.xpath("search box")), "kids");
	
	}
	public void clickOnSearchButton(ChromeDriver driver) {
		Shared.clickOnElement(driver.findElement(By.xpath("searchButton")));
	}
	public void clickOnToyList(ChromeDriver driver) {
		Shared.clickOnElement(driver.findElement(By.xpath("toyList")));
	}
	
	public void verifyBirthTo24MonText(ChromeDriver driver) {
		Shared.verifyText(driver.findElement(By.xpath("")), "Birth To 24 Months");
	}
	
	public void clickOnBirtTo24MonOption(ChromeDriver driver) {
		Shared.clickOnElement(driver.findElement(By.xpath("birtTo24")));
	}
	
	public void getCountOfBirtTo24(ChromeDriver driver) {
		int count=Shared.getCountOfElements(driver.findElements(By.xpath("")));
		System.out.println(count);
	}
	*/
	public void isLogoPresent() {
		boolean result=Shared.isElementPresent(driver,ObjectRepo.ele);
		System.out.println(result);
	}

	public void typeKidsOnSearchBox() {
		Shared.typeOnTextBox(driver.findElement(By.xpath("search box")), "kids");
	
	}
	public void clickOnSearchButton() {
		Shared.clickOnElement(driver.findElement(By.xpath("searchButton")));
	}
	public void clickOnToyList() {
		Shared.clickOnElement(driver.findElement(By.xpath("toyList")));
	}
	
	public void verifyBirthTo24MonText() {
		Shared.verifyText(driver.findElement(By.xpath("")), "Birth To 24 Months");
	}
	
	public void clickOnBirtTo24MonOption() {
		Shared.clickOnElement(driver.findElement(By.xpath("birtTo24")));
	}
	
	public void getCountOfBirtTo24() {
		int count=Shared.getCountOfElements(driver.findElements(By.xpath("")));
		System.out.println(count);
	}
	
	
	
	
	
	
	
	
	
	
}
