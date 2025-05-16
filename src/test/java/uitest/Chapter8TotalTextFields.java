package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter8TotalTextFields {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> textFieldList = driver.findElements(By.className("form-control"));
		int fieldNumber = textFieldList.size();
		System.out.println(fieldNumber);
		
		for (WebElement e : textFieldList) {
			String placeholdertext =e.getAttribute("placeholder");
			System.out.println(placeholdertext);
			
		}
	}

}
