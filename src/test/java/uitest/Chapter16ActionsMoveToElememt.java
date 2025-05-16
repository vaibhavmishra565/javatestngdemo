package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter16ActionsMoveToElememt {
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
//		action classs >> used to perform all the actions which are done by mouse and keyboard 
//		By Addons = By.xpath("//div[text() ='Add-ons']");
//		By visaServe = By.xpath("//div[@class='css-1dbjc4n r-6gpygo r-cn9azx']//div[text() = 'Visa Services']");
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(Addons)).perform();
//		Thread.sleep(1500);
//		driver.findElement(visaServe).click();
		By  parentMenu =By.xpath("//*[text() ='Add-ons']");
		By childMenu = By.xpath("//*[@class='css-1dbjc4n r-6gpygo r-cn9azx']//*[text() = 'Visa Services']");
		parentChildMenu(parentMenu, childMenu);
		
//		
		
//		parentChildMenu("Add-ons", "Visa Services");
	}
	public static void parentChildMenu(By parent  , By child) throws InterruptedException{
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).perform();
		Thread.sleep(1500);
		getElement(child).click();
		}
	

	public static void parentChildMenu(String parent , String child) throws InterruptedException{
//		By Addons = By.xpath("//div[text() ='Add-ons']");
//		By visaServe = By.xpath("//div[@class='css-1dbjc4n r-6gpygo r-cn9azx']//div[text() = 'Visa Services']");
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(By.xpath("//*[text() ='"+parent+"']"))).perform();
		Thread.sleep(1500);
		getElement(By.xpath("//*[@class='css-1dbjc4n r-6gpygo r-cn9azx']//*[text() = '"+child+"']")).click();
		
		
	}
	public static WebElement getElement(By locator ) {
		return driver.findElement(locator);
	}
}
