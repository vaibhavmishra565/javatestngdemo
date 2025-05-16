package uitest;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// back and forward button 
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in/");
//		
//		driver.navigate().to("https://www.amazon.co.in");
//		
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
		
//		
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.amazon.co.in");
		Thread.sleep(1000);
		driver.navigate().to(new URL("https://www.google.co.in/"));
		Thread.sleep(2000);
		driver.navigate().refresh(); // this method is used for refreshing the page , but it should not be used frequently
		// when we go back or forwwad or refresh the web elemant we are targeting also get refresh 
				
	}

}

// both get method and to method are same , internally .to method is calling the get method
// only to method can be used for back and forward navigation 
// to navigate is method which is overloded , while get method is not overloaded 
// 
