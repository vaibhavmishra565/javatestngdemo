package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSessions {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.quit();
		driver.close();
		
	}

}
