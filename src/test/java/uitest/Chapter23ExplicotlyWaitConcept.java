package uitest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chapter23ExplicotlyWaitConcept {
	static WebDriver driver ;

	public static void main(String[] args) {

//		Explicit Wait
//		Two types >> Web driver wait 
//		fluent wait 
//		Wait(I) until() >> Implements > FluentWait Class >> Extends webdriver wait 
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By loginid = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement emeilElement = wait.until(ExpectedConditions.presenceOfElementLocated(loginid));
//		emeilElement.sendKeys("Vaibhav");
//		driver.findElement(password).sendKeys("mishra");
//		driver.findElement(login).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement welele = wait.until(ExpectedConditions.presenceOfElementLocated(login));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement elele =  wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		
		
//		
//		waitForElementVisibility(loginid, 10).sendKeys("vaibhav");
//		driver.findElement(password).sendKeys("Mishra");
//		driver.findElement(login).click();
		
		doSendKeys(loginid, 10, "Vaibhav");
		doSendKeys(password, 10, "mishra");
		doClick(login, 5);
		
	}
	
//	public static WebElement waitForElementPresence(By locator , int timeout) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		
//		this meythod says that the this will result when the element is present in DOM of the page ,
//		not its present on the page so the function is not doing good for the end user 
//		this does not imply that the elemnt is visible on the page 

	public static void waitForElementPresence () {}
	
	}
	public static WebElement waitForElementVisibility(By locator , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//		This method says it will wait for the element visibilty that it is visible or not 
	}
	
	public static void doClick (By locator , int timeout ) {
		waitForElementVisibility(locator, timeout).click();
		
	}
	public static void doSendKeys (By locator , int timeout , String value) {
		waitForElementVisibility(locator, timeout).sendKeys(value);
	}
	
	
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
		
	}
}
		
	
