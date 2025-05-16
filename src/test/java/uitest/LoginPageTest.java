package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Open the login page
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Maximize the window
		driver.manage().window().maximize();

		// Create an object of ElementUtilClass
		ElementUtilClass util = new ElementUtilClass(driver);
		
		By emailid = By.id("input-email");
		By password =By.id("input-password");

		// Call the doSendKeys method
		ElementUtilClass.dosendkeys(By.id("input-email"), "test@gmail.com");

		// Close the browser after use
		driver.quit();
	}

		
	}


