package uitest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chapter11DropDownHandlingWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");

//		List<WebElement> optionList = driver.findElements(By.xpath("//select[@id = 'Form_getForm_Country']/option"));

//		System.out.println(optionList.size());
//		for (WebElement e : optionList ) {
//			String Text= e.getText();
//			System.out.println(Text);
//			if (Text.equals("India")) {;
//			e.click();
//			System.out.println("Pass");
//			break;
		By Optionslocator = By.xpath("//select[@id = 'Form_getForm_Country']");
//		selectDropdownlistWithoutSelectClass(Optionslocator, "India");
		selectDropdownlistwithSelectClass(Optionslocator, "India");

//		}

//	}

	}

	// _____________________________Rough Method_____________________________

//	public static void selectDropdownlistWithoutSelectClass(By locator, String value) {
//		List<WebElement> optionslist = getElements(locator);
//		System.out.println("Total number of options are " + optionslist.size());
//		for (WebElement e : optionslist) {
//			String Text = e.getText();
//			System.out.println(Text);
//			if (Text.equals(value)) {
//				e.click();
//				break;
//			}
//		}
//
//	}
	// **** select Dropdown list Without Select Class*****************

	public static void selectDropdownlistWithoutSelectClass(By locator, String value) {
		List<WebElement> optionslist = getElements(locator);
		System.out.println("Total number of options are " + optionslist.size());
		selectDropDown(optionslist, value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	// **** select Dropdown list With Select Class*****************
	public static void selectDropdownlistwithSelectClass(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
		selectDropDown(optionList, value);
	}
	// _____________________________Rough Method_____________________________

//	public static void selectDropdownlistwithSelectClass(By locator, String value) {
//		Select select = new Select(getElement(locator));
//		List<WebElement> optionList = select.getOptions();
//		System.out.println("The total number of options are " + optionList.size());
//		for (WebElement e : optionList) {
//			String text = e.getText();
//			if (text.equals(value)) {
//				e.click();
//				break;
//			}
//
//		}
//
//	}
	
	// **** select Dropdown list and clicking the option internally *****************

	private static void selectDropDown(List<WebElement> optionList, String Value) { // making this private but going to
										// access this in public it is known as encapsulation
		System.out.println("The total number of options are " + optionList.size());
		for (WebElement e : optionList) {
			String text = e.getText();
			if (text.equals(Value)) {
				e.click();
				break;

			}

		}
	}

	public static List<WebElement> getElements(By Locator) {

		return driver.findElements(Locator);
	}
}

//Interview questions
//get options with select class 
//get options without select class
//select option
