package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter10ElementExceptionWithFEAndFES {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logo = By.className("img-responsive11");
//		driver.findElement(logo).click(); // no such element exception 
		
		List<WebElement> logos =driver.findElements(logo);// empty list 
		System.out.println(logos.size()); // zero found 
		
		
		
		
	}

}
