package uitest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chapter12PollingTimeConcept {
	static WebDriver driver ;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By loginid = By.id("input-email");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
//		the default polling time or the interval berween the two search of elemenet is 500 milisec 
//		the polling time we can give is in this is 2 seconds
//		wait.until(ExpectedConditions.visibilityOfElementLocated(loginid)).sendKeys("Vaibhav");
//		waitForElementAndClick(loginid, 10);
		
	  By terms =	By.xpath("//a[text()='Terms & Conditions']");
	  ElementUtilClass util = new ElementUtilClass(driver);
	  util.waitForElementAndClick(terms, 5);
		
	}
	/*
	 * An expectation for checking that an element is present on the DOM of a page and visible.Visibility 
	 * means that the element is not only displayed but also has a height and width that isgreater than 0
	 */
	
	
	public static void waitForElementVisible (By locator , int waitTime , int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime), Duration.ofSeconds(intervalTime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				
	}
	 /*
	  * An expectation for checking an element is visible and enabled such that you can click it
	  */
	public static void waitForElementAndClick(By locator , int timeout ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();;
		
	}

}
