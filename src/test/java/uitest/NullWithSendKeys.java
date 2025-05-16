package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullWithSendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.findElement(By.id("input-email")).sendKeys(null);// Exception in thread "main" java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		
		String blank="";
		System.out.println(blank);
		driver.findElement(By.id("input-email")).sendKeys(blank);// for giving blank it is not throwing exception 
		

	}

}
