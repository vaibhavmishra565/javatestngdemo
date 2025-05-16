package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Google")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		driver.quit();
//	System.out.println(driver.getTitle()); // Session ID is null. Using WebDriver after calling quit()?
		driver = new ChromeDriver() ;
		System.out.println(title);
		

	}

}

// driver close method The WebDriver session remains active, meaning you can still interact with other windows.
