package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter17ActionsSemdKeysWithPause {
	static WebDriver driver ;

	public static void main(String[] args) {
		
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstname = By.id("input-firstname");
//		WebElement first_name = driver.findElement(firstname);
//		Actions act = new Actions(driver);
//		
//		String myName = "Vaibhav Mishra";
//		char ch[] = myName.toCharArray(); // as char is not class 
//		for (char c : ch) {
//			act.sendKeys(first_name, String.valueOf(c)).pause(250).build().perform();
//		}
		
		actionsDosendKeysWithPause(firstname, "vaibhav Mishra test", 250);
		
		
		
		
		
		
	}
	public static void actionsDosendKeysWithPause(By locator , String value , long pause ) 
	{
		Actions act = new Actions(driver);
		char ch[] = value.toCharArray();
		for (char c : ch) {
			act.sendKeys(getElement(locator), String.valueOf(c)).pause(pause).build().perform();
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
