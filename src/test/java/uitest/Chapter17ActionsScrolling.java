package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter17ActionsScrolling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act = new Actions(driver);
		
//		*********** Partial Scroll
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
//		
//*********************bottom of the page scrolling 
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		Thread.sleep(2000);
//		*********** Top of the page scrolling 
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		act.
			scrollToElement(driver.findElement(By.xpath("//a[text()='OpenCart']")))
			.pause(500).click(driver.findElement(By.xpath("//a[text()='OpenCart']")))
			.build().perform();
		
	}

}
