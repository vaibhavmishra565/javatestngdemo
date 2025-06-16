package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter20NewWindowConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String parentid = driver.getWindowHandle();
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		driver.quit();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		

	}

}
