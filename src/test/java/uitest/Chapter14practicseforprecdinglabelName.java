package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter14practicseforprecdinglabelName {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> labelNames = driver.findElements(By.xpath("//label[@for='input-telephone']/preceding::label"));
		for(WebElement e : labelNames) {
			String text = e.getText();
			System.out.println(text);
		}
		
	}

}
