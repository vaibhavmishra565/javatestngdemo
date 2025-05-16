package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// very important interview question
		// for x path / is for direct Child , and "//" is for the indierct child

		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
//		driver.findElement(By.name("q")).sendKeys("Selenium");
//		Thread.sleep(3000);

//		By suggestion = By.xpath("//ul/li/div//div[@class='wM6W7d']/span");
//		List<WebElement> listitems = driver.findElements(suggestion);
//		System.out.println(listitems.size());
//		//*[@id="jZ2SBf"]/div[1]/span
//		for(WebElement e : listitems) {
//			String sugg =e.getText();
//			System.out.println(sugg);
//			if (sugg.contains("python")) {
//				e.click();
//				break;
//			}
//		}
//		
		By searchField = By.name("q");
		By suggestion = By.xpath("//ul/li/div//div[@class='wM6W7d']/span");
//		doSearch(searchField, suggestion, "selenium", "python");
		ElementUtilClass elutil = new ElementUtilClass(driver);
		elutil.doSearch(searchField, suggestion, "selenium", "cypress");
		

	}

	public static void doSearch(By searchField, By suggestion, String searchText, String matchValue)
			throws InterruptedException {
		driver.findElement(searchField).sendKeys(searchText);
		Thread.sleep(3000);

		List<WebElement> listitems = driver.findElements(suggestion);
		System.out.println(listitems.size());
		for (WebElement e : listitems) {
			String sugg = e.getText();
			System.out.println(sugg);
			if (sugg.contains(matchValue)) {
				e.click();
				break;
			}
		}

	}

}
