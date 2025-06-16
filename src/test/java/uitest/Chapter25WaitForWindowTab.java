package uitest;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chapter25WaitForWindowTab {
	static WebDriver driver ;

	public static void main(String[] args) {

		driver = new ChromeDriver ();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains (text(),'Executive Profile')]"));
		Actions act = new Actions(driver);
		act.click(executiveProfile).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(flag);
	}
	
	public static boolean waitForWindowOrTab(int expectedNumberOfWindows , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if( wait.until(ExpectedConditions.numberOfWindowsToBe(expectedNumberOfWindows))) {
			return true ;
		}
		}
		catch (org.openqa.selenium.TimeoutException e) {
			System.out.println("window number not matched");
					}
		return false;
	}

}
