package uitest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chapter11SelectDropDownAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");

		By countryNmae = By.id("Form_getForm_Country");

//		Select select = new Select(driver.findElement(countryNmae));
//		List<WebElement> optionList = select.getOptions();
//		int optionsSize = optionList.size();
//		System.out.println(optionsSize);
//
//		for (WebElement e : optionList) {
//			String listOptionsText = e.getText();
//			System.out.println(listOptionsText);

//		}
		// to find the single element 
				
		if (getDropDownOptionsTextList(countryNmae).contains("India")) {
			System.out.println("pass");
		}
		
		// to find multiple element 
		List<String> expectedOptionslist = Arrays.asList("India" , "Brazil" , "Austria");
		if (getDropDownOptionsTextList(countryNmae).contains(expectedOptionslist)) {}
		System.out.println("Pass");
		
	}
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
	}
	                                           
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
		System.out.println(optionList.size());
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionList) {
			String text = e.getText();
			optionsTextList.add(text);
			
		}
		return optionsTextList;
		
	} 

}
