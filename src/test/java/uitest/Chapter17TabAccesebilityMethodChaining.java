package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter17TabAccesebilityMethodChaining {
	static WebDriver driver ;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(By.id("input-firstname")), "Vaibhav").
		pause(200).sendKeys(Keys.TAB).
		sendKeys("Mishra").pause(200)
		.sendKeys(Keys.TAB)
		.sendKeys("vaixyz@gmail.com").pause(200)
		.sendKeys(Keys.TAB).sendKeys("123456")
		.pause(200).sendKeys(Keys.TAB).sendKeys("mishra").pause(200).sendKeys(Keys.TAB).sendKeys("mishra")
		.pause(500).sendKeys(Keys.TAB).pause(500).sendKeys(Keys.TAB).pause(500).sendKeys(Keys.TAB)
		.sendKeys(Keys.SPACE).sendKeys(Keys.TAB).pause(500).sendKeys(Keys.ENTER)
		.build().perform();
		
		
		
		
	}

}
