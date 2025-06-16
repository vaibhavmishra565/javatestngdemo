package uitest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter20BrowsserWindowHandlingConcept {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
//		if there is anywhere where target = blank , then it start a new window i.e target="_blank" then will open a new window 
		driver.get("https://www.orangehrm.com/");
		WebElement linkdin = driver.findElement(By.xpath("//img[@alt=\"linkedin logo\"]")) ;
		Actions act = new Actions(driver);
		act.click(linkdin).perform();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentwindowID = it.next();
		System.out.println(parentwindowID);
		String childWindowID = it.next();
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowID);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
