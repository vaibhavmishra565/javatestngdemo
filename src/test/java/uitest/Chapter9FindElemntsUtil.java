package uitest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter9FindElemntsUtil {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By imagesList = By.tagName("img");
		By Linkslist = By.tagName("a");

		int Numberoflinks = getElementsCount(Linkslist);
		System.out.println(Numberoflinks);
		printElementTextList(Linkslist);

	}
	
	public static void printElementTextList(By locator) {
		List<String> eleTextList = getElementsTextList(locator);
		for (String e : eleTextList) {
			System.out.println(e);
		}
		
	}

	public static List<String> getElementsTextList(By locator) { // have to revise this once again (important 
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String eleText = e.getText();
			if (eleText.length() != 0) {
				eleTextList.add(eleText);
			}
		}
		return eleTextList;

	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
