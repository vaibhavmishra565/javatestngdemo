package uitest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chapter24WaitForElements {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By footers = By.cssSelector("footer li");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> footerElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footers));
//		An expectation for checking that all elements present on the web page that match the locatorare visible. Visibility means that the 
//		elements are not only displayed but also have a heightand width that is greater than 0.

		System.out.println(footerElements.size());

	}
	public static void waitForElementsVisible( By locator , int timeoOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoOut));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
//	An expectation for checking that there is at least one element present on a web page.
	public static void waitForElementsPresence(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

}
