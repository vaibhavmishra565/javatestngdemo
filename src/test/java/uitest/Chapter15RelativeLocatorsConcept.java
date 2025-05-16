package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Chapter15RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		////////////     Conceot of relative locator //////////////
//		 in selenium 4.0 and above these methods introduced 
		
		
//					Above 
//		Right		Element 		 Left 
//		Near 			Below 
		
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://selectorshub.com/xpath-practice-page/");
//		WebElement ele = driver.findElement(By.linkText("John.Smith"));
//		Thread.sleep(3000);
//		String userRole = driver.findElement(with(By.tagName("td")).toRightOf(ele)).getText();
//		System.out.println(userRole);
		
		WebElement ele = driver.findElement(By.xpath("//td[text()='John Smith']"));
		String role = driver.findElement(with(By.tagName("td")).toLeftOf(ele)).getText();
		String status = driver.findElement(with(By.tagName("td")).toRightOf(ele)).getText();
		String aboveName = driver.findElement(with(By.tagName("td")).above(ele)).getText();
		String belowName = driver.findElement(with(By.tagName("td")).below(ele)).getText();
		Thread.sleep(3000);
		System.out.println(role);
		System.out.println(status);
		System.out.println(aboveName);
		System.out.println(belowName);
		
		
		////////////////////////////////////  Near Element ///////////////////////////////////////
//		The distance between base element and near element is 50 pixel 
		
		String near = driver.findElement(with(By.tagName("table")).near(ele)).getText();
		System.out.println(near);
		
		

	}

}
