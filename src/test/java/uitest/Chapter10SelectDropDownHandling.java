package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chapter10SelectDropDownHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");

		// for dropDown HTMl tag is select
		// we have to use select claass in selenium
		// its like select > option
		// have to make a webelemnt always

		By countryNmae = By.id("Form_getForm_Country");
		WebElement countryele = driver.findElement(countryNmae);
		Select select = new Select(countryele);// we have to supply one element to the function
		// 1. select by visible text in the dropdown
//		select.selectByVisibleText("Australia");

		// 2. Select by index

//		select.selectByIndex(5); // should be rarely used as the index value can be changed
		// can be used in calaender or selecting month

		// 3. select by value
//		select.selectByValue("Australia");
		
//		selectDropdownValueByVsibleText(countryNmae, "Brazil");
//		selectDropdownValueVByIndex(countryNmae, 10);
		selectDropdownValueByValue(countryNmae, "India");
				
		System.out.println(getDropDownOptionsCount(countryNmae));
		List<WebElement> listOfOptions = driver.findElements(countryNmae);
		int count = getDropDownOptionsCount(countryNmae);
		for(WebElement e : listOfOptions ) {
			e.getText();
		}
	}

	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();

	}

	public static void selectDropdownValueByVsibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);

	}

	public static void selectDropdownValueVByIndex(By Locator, int index) {
		Select select = new Select(getElement(Locator));
		select.selectByIndex(index);

	}

	public static void selectDropdownValueByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
