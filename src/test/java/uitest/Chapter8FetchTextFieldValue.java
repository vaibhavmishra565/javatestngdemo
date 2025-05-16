package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter8FetchTextFieldValue {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		driver.findElement(By.id("input-email")).sendKeys("Vai@gamil.com");
//		String inputTEXT=driver.findElement(By.id("input-email")).getAttribute("value"); // it provieds always the input value some time
//																		// it may be hidden also
//		System.out.println(inputTEXT);

		By mailId = By.id("input-email");
		By password = By.id("input-password");
		By forgotpassword = By.linkText("Forgotten Password");

		dosendkeys(mailId, "Vaigamil.com");
		String s1 = getElementAttribute(mailId, "value");
		System.out.println(s1);

		dosendkeys(password, "vai123");
		String s2 = getElementAttribute(password, "value");
		System.out.println(s2);
		
		String s3=getElementAttribute(forgotpassword, "href");
		System.out.println(s3);
		

	}

	public static void dosendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static String getElementAttribute(By locator, String AttributeName) {
		return getElement(locator).getAttribute(AttributeName);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}

////  two methods for creating or locating webelements 
//1. Find elenement
//2. Find Elements
//
//action performing methods on the elements
//text ;get text
//doclick click 
//get attribute fetch attribute valu
//Send keys to input values 
//is displayed 
//is enabled 
//is selected






