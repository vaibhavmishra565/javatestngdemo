package uitest;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chapter24WaitForTitleAndUrl {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		/*
		 * An expectation for checking the title of a page. which returns boolean value
		 */
//		if (wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support."))) {
//			System.out.println("the title is correct ");
//			
//		}else {
//			System.out.println("the page title is not correct ");
//		}

////		Free CRM software for customer relationship management, sales, and support.
//		boolean flag = false;
//		try {
//			flag = wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, "));
//			flag = true;
//		} catch (TimeoutException e) {
//			System.out.println("the title is not present");
//
//		}
//		waitForTitle("Free CRM software for customer relationship management, sales, and support.", 5);
		
		String title = getPageTitleIs("Free CRM software for customer relationship management, sales, and support.", 5);
		System.out.println(title);
		
		ElementUtilClass elutil = new ElementUtilClass(driver);
		String url =elutil.getPageURLIs("freecrm", 10);
		System.out.println(url);

	}
	
	
	public static String getPageTitleIs (String expectedTitle, int timeOut) {
		if (waitForTitleIs(expectedTitle, timeOut)) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
				
	}

	public static Boolean waitForTitleIs(String expectedTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;
		try {
			return wait.until(ExpectedConditions.titleIs(expectedTitle));
			
		} catch (TimeoutException e) {
			System.out.println("The title is not same");
			return flag;

		}

	}
	public static Boolean waitForTitleContains(String PartialTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;
		try {
			return wait.until(ExpectedConditions.titleContains(PartialTitle));
			
		} catch (TimeoutException e) {
			System.out.println("The title is not same");
			return flag;

		}

	}
	

}
