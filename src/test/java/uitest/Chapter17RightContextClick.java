package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter17RightContextClick {
	static WebDriver driver ;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		context click and right click are same 
		By rightClick = By.xpath("//span[text()='right click me']");
//		Actions act = new Actions(driver);
//		act.contextClick(driver.findElement(rightClick)).perform();
//		List<WebElement> OptionList  =driver.findElements(By.cssSelector("ul.context-menu-list li"));
//		System.out.println(OptionList.size());
//		for (WebElement e : OptionList ) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}
		By textLocator = By.xpath("//span[text()='Copy']");
		contextRightClickActions(rightClick ,textLocator );

	}
	public static void contextRightClickActions(By locator , By textLocator) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator)).perform();
		driver.findElement(textLocator).click();
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
