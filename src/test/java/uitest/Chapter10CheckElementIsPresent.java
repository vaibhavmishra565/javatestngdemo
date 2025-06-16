package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter10CheckElementIsPresent {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logo = By.className("img-responsive");
		By links = By.xpath("//div[@class=\"list-group\"]/a");
		By forgotPasswordinks = By.linkText("Forgotten Password");
		By footerLinksText = By.xpath("//footer//div[@class='row']//a");
		
//		int count = driver.findElements(logo).size();
//		System.out.println(count);
//		if (count == 1) {
//			System.out.println("Elements are present");
//		} else {
//			System.out.println("Element is not present");
//		}
		System.out.println(isElementsPresent(logo));
		System.out.println(isElementsPresent(logo, 2));
		System.out.println(isElementsPresent(links, 13));
		System.out.println("--------------");
		System.out.println(isElementPrsentMultipleTimes(forgotPasswordinks));
		
		ElementUtilClass elutil = new ElementUtilClass(driver);
		System.out.println(elutil.getElementsCount(footerLinksText));
		elutil.printElementTextList(footerLinksText);
			
	}

	public static boolean isElementNotPresent(By locator) {
		if (getElementsCount(locator) == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isElementPrsentMultipleTimes(By locator) {
		if (getElementsCount(locator) >= 1) {
			return true;

		} else {
			return false;
		}
	}

	public static boolean isElementsPresent(By locator, int expectedCount) {
		if (getElementsCount(locator) == expectedCount) {

			System.out.println("");
			return true;
		}
		return false;

	}

	public static boolean isElementsPresent(By locator) {
		if (getElementsCount(locator) == 1) {

			System.out.println("");
			return true;
		}
		return false;

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();

	}

}
