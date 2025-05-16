package uitest;

//import java.util.NoSuchElementException;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter7IsElementEnabledAndSelected {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
//		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

//		boolean f1 =driver.findElement(By.id("fname")).isDisplayed();
//		System.out.println(f1);
//		boolean f2= driver.findElement(By.id("fname")).isEnabled();
//		System.out.println(f2);
//		boolean f3 =driver.findElement(By.id("pass")).isDisplayed();
//		System.out.println(f3);
//		boolean f4 =driver.findElement(By.id("pass")).isEnabled();
//		System.out.println(f4);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		boolean f5 = driver.findElement(By.name("agree")).isSelected();
//		System.out.println(f5);
//
//		driver.findElement(By.name("agree")).click();
//		boolean f6 = driver.findElement(By.name("agree")).isSelected();
//		System.out.println(f6);
		By agreebox = By.name("agree11");
		boolean f1=isElementEnabled(agreebox);
		System.out.println(f1);
//		driver.findElement(agreebox).click();
		boolean f2 = isElementSelected(agreebox);
		System.out.println(f2);

	
		
		
	}

	public static boolean isElementEnabled(By locator) {
		try {
		return getElement(locator).isEnabled();}
		catch(NoSuchElementException e) {
			System.out.println(locator);
			return false;
		}

	}
	public static boolean isElementSelected(By locator) {
		try {
		return getElement(locator).isSelected();}
		catch(NoSuchElementException e1) {
			System.out.println(locator);
			return false;
			}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
}