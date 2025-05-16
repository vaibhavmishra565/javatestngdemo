package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter7SendKeysWithDisableTextField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		driver.findElement(By.id("pass")).sendKeys("Value");
		// Throws exception ::  element not interactable
		
		driver.findElement(By.id("pass")).click();
//		Will not throw exception but will not do anything 
		
		

	}

}
