package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter10GoogleLanguageLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement>langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langLinks.size());
		for(WebElement e: langLinks) {
			String language =e.getText();
			System.out.println(language);
//			if (language.contains)) {
//				e.click();
//				break;
//			}
		}
		

	}

}


