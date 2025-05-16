package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter17Prctice {
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://regression2.academiaerp.com/#");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).pause(300).
		sendKeys(Keys.TAB).pause(300).
		sendKeys(Keys.TAB).pause(300).
		sendKeys(Keys.TAB).pause(300).
		sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		act.sendKeys(driver.findElement(By.id("username")), "sysadmin").pause(300).sendKeys(Keys.TAB).sendKeys("password").
		sendKeys(Keys.TAB).pause(300).
		sendKeys(Keys.TAB).pause(300).sendKeys(Keys.ENTER).
		build().perform();
		
	}

}
