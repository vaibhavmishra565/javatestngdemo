package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter7SendKeysWithCharSEquence {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String name = "Vaibhav";
		StringBuilder sb = new StringBuilder("Mishra");
		StringBuffer sf = new StringBuffer("Lessons");
		
		
//		Charsequence is a interface 
//		it is implemented by 3 class
//		1.string
//		2.String Builder
//		3.String Buffer 
		
		driver.findElement(By.id("input-email")).sendKeys(name," " ,sb ," ", sf ," ", "Testing");
				

	}

}
