	package uitest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chapter25WaitForalert {
		
		static WebDriver driver ;
		
	

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement javascriptlink = new ElementUtilClass(driver).waitForElementVisibility(By.xpath("//a[text()='JavaScript Alerts']"), 10);
		javascriptlink.click();
		List<WebElement> allbuttons = new ElementUtilClass(driver).waitForElementsVisible(By.xpath("//button"), 10);
		for(WebElement button: allbuttons) {
			if(button.getText().equals("Click for JS Alert")) {
				button.click();
				break;
			}
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1));
		wait.until(ExpectedConditions.alertIsPresent());
//		Thread.sleep(10000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.dismiss();
	}
	
	public static Alert waitForAlertAndSwitch(int timeOut) {
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	public static String getAlertText (int timeOut) {
		return waitForAlertAndSwitch(timeOut).getText();
	}
	public static void acceptAlert (int timeOut) {
		waitForAlertAndSwitch(timeOut).accept();
		
	}
	public static void dismissAlert(int timeOut) {
		waitForAlertAndSwitch(timeOut).dismiss();
		
	}
}
