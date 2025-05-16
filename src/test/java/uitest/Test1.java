package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	
	public static String browser = "Chrome" ;
	
	

	public static void main(String[] args) {
		if (browser.equals("Chrome")) {
			ChromeDriver driver = new ChromeDriver();
		}
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
		
		

	}

}
