package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter16ActionsSendKeys {
	static WebDriver driver ;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(By.id("input-firstname")), "Vaibhav").perform();
//		act.click(driver.findElement(By.name("agree"))).perform();
//		act.click(driver.findElement(By.className("btn-primary"))).perform();
//		
//		Webele click >> click
//		action click >> move >> click (Perform user actions)

//		Web send Keys >> >> send keys 
//		action sendkeys >> move >> send keys 
		
//		when to use actions send keys >> when elemnts can not be intractable we use actions send kys 
//		 either use normal sendkeys 
//		Three ways to click or send kys 
//		web element sendkeys 
//		action send keys 
//		java script send keys 
		
		By firstname = By.id("input-firstname");
		By agree = By.name("agree");
		By continueButton = By.className("btn-primary");
		
//		doActionsSendKeys(firstname, "avibhav");
//		doActionClick(agree);
//		doActionClick(continueButton);
		
		ElementUtilClass eleutil = new ElementUtilClass(driver);
		eleutil.doActionsSendKeys(firstname, "vaibhav");
		eleutil.doActionClick(agree);
		eleutil.doActionClick(continueButton);
		
		

	}
	
//	public static void doActionClick (By locator ) {
//		Actions act = new Actions(driver);
//		act.click(getElement(locator)).perform();
//		
//	}
//	
//	public static void doActionsSendKeys (By locator , String value) {
//		Actions act = new Actions(driver);
//		act.sendKeys(getElement(locator), value).perform();
//	}
//public static WebElement getElement(By locator) {
//	return driver.findElement(locator);
//}
}
