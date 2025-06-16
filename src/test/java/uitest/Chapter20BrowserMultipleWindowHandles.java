package uitest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter20BrowserMultipleWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		String parentID = driver.getWindowHandle();
		WebElement OrangeHrm = driver
				.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[1]/a"));
		WebElement Executive = driver
				.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[2]/a"));
		WebElement pressRelease = driver
				.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[3]/a"));
		WebElement carrers = driver
				.findElement(By.xpath("/html/body/footer/section/div[2]/div/div/div[1]/div/ul/li[5]/a"));

		Actions act = new Actions(driver);
		act.click(OrangeHrm).perform();
		act.click(Executive).perform();
		act.click(pressRelease).perform();
		act.click(carrers).perform();

//	fetch the window ids 
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String windowid = it.next();
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle());
			if (!windowid.equals(parentID)) {
				driver.close();

			}

		}

	}

}
