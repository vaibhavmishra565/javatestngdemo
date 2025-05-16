package uitest;

//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter7ElementDisplayedMethod {
	static WebDriver driver ;
	

	public static void main(String[] args) {
		driver = new ChromeDriver ();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		boolean flag =driver.findElement(By.className("img-responsive")).isDisplayed();
//		System.out.println(flag);

		By logo = By.className("img-responsive11");// there is no such element  with this class name 
		if(isElementDisplayed(logo)) {
		System.out.println("Logo is present");
		}
		else {
			System.out.println("Logo is not present ");
		}
		
	}
	public static boolean isElementDisplayed(By locator) {
		try {
		return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed "+ locator);
			return false;
			
		}
		
	}
	
	public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}
