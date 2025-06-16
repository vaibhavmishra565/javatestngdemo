package uitest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter23ImplicitlyWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // because this code is depricated and was used in selenium 3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // used in selenium 4 
//		Now every eelemnt will have a wait of 10 seco
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("vaibhav");
//		10 secs >> 2 secs > 1secs 
//		10 Secs >> 12 Secs >> NSE 
		
		driver.findElement(By.id("input-password")).sendKeys("mishra"); // these elements will wait for another 10 secs for there actions 
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();// these elements will wait for another 10 secs for there actions 
		
//		now suppose for home page 10 Secs is required 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		E1 , E2 , E3 all will have 10 secs 
		
//		for login page it requires only 5 secs 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		E4 , E5 , E6 all will have 5 secs 
		
		
//		 now for another it requires 0 secs 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
//		so after this all have only 0 secs to wait 
//		 these are the issue with the implicitly wait , we have to define every time that create a time 
//		and every element have to wait for the defined duration even it is visisble 
//		it can not be applied for the single element 
//		It cannot be used in non Webelements , like title URL , windows , Js popup etc 
//		
		
		
		
		
	}

}
