package uitest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtilClass {

	private WebDriver driver;
	private Actions act;

	public ElementUtilClass(WebDriver driver, Actions act) {
		super();
		this.driver = driver;
		this.act = act;
	}

	// Constructor to initialize the driver
	public ElementUtilClass(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed " + locator);
			return false;
		}

	}

	// Send keys method
	public void dosendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public boolean isElementEnabled(By locator) { // why there was error when used static ????
		return getElement(locator).isEnabled();

	}

	public boolean isElementelected(By locator) {
		return getElement(locator).isSelected();
	}

	public String getElementAttribute(By locator, String AttributeName) {
		return getElement(locator).getAttribute(AttributeName);

	}

	public boolean isElementNotPresent(By locator) {
		if (getElementsCount(locator) == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isElementsPresent(By locator, int expectedCount) {
		if (getElementsCount(locator) == expectedCount) {

			System.out.println("");
			return true;
		}
		return false;

	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();

	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	// get text from the tag
	public String doGetText(By locator) {
		String eltext = getElement(locator).getText();
		if (eltext != null) {
			return eltext;
		} else {
			return null;
		}
	}

	// Click method
	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void printElementTextList(By locator) {
		List<String> eleTextList = getElementsTextList(locator);
		for (String e : eleTextList) {
			System.out.println(e);
		}

	}

	public List<String> getElementsTextList(By locator) {
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

	public boolean doSearch(By searchField, By suggestion, String searchText, String matchValue)
			throws InterruptedException {
		boolean flag = false;
		dosendkeys(searchField, searchText);
		Thread.sleep(3000);

		List<WebElement> listitems = getElements(suggestion);
		System.out.println(listitems.size());
		int totalsuggestion = listitems.size();
		System.out.println("Total number of suggestions are >>" + totalsuggestion);
		if (totalsuggestion == 0) {
			System.out.println("there are no suggestions");
			throw new Chapter9FrameworkException("There is no suggestions");
		}

		for (WebElement e : listitems) {
			String sugg = e.getText();
			System.out.println(sugg);
			if (sugg.contains(matchValue)) {
				e.click();
				flag = true;
				break;
			}
		}
		if (flag = true) {
			System.out.println(matchValue + " is found");
			return true;
		} else {
			System.out.println(matchValue + " is not found");
			return false;
		}

	}

	// Get the WebElement
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

//	**********************---------------------- select DropDwon util ------------------********************
	public Select getSelect(By locator) {
		return new Select(getElement(locator));
	}

	public int getDropDownOptionsCount(By locator) {
		return getSelect(locator).getOptions().size();
	}

	public void selectDropdownValueByVsibleText(By locator, String visibleText) {
//		Select select = new Select(getElement(locator));
		getSelect(locator).selectByVisibleText(visibleText);

	}

	public void selectDropdownValueVByIndex(By Locator, int index) {
//		Select select = new Select(getElement(Locator));
		getSelect(Locator).selectByIndex(index);

	}

	public void selectDropdownValueByValue(By locator, String value) {
//		Select select = new Select(getElement(locator));
		getSelect(locator).selectByValue(value);
	}

	public List<String> getDropDownOptionsTextList(By locator) {
//		Select select = new Select(getElement(locator));
		List<WebElement> optionList = getSelect(locator).getOptions();
		System.out.println("The total number of options are " + optionList.size());
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionList) {
			String text = e.getText();
			optionsTextList.add(text);

		}
		return optionsTextList;

	}

	public void selectDropdownlist(By locator, String value) {
		List<WebElement> optionslist = getElements(locator);
		System.out.println("The total number of options are " + optionslist.size());
		for (WebElement e : optionslist) {
			String Text = e.getText();
			System.out.println(Text);
			if (Text.equals(value)) {
				e.click();
				break;
			}
		}

	}

	// **** select Dropdown list and clicking the option internally//
	// *****************
	private void selectDropDown(List<WebElement> optionList, String Value) { // making this private but going to
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

	// **** select Dropdown list Without Select Class*****************

	public void selectDropdownlistWithoutSelectClass(By locator, String value) {
		List<WebElement> optionslist = getElements(locator);
		System.out.println("Total number of options are " + optionslist.size());
		selectDropDown(optionslist, value);
	}

	// **** select Dropdown list With Select Class*****************
	public void selectDropdownlistwithSelectClass(By locator, String value) {
//		Select select = new Select(getElement(locator));
		List<WebElement> optionList = getSelect(locator).getOptions();
		selectDropDown(optionList, value);
	}

	/////////////////////////////// ******* Actions Util
	/////////////////////////////// ************/////////////////////////////////
	public void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();

	}

	public void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	public  void actionsDosendKeysWithPause(By locator , String value , long pause ) 
	{
		char ch[] = value.toCharArray();
		for (char c : ch) {
			act.sendKeys(getElement(locator), String.valueOf(c)).pause(pause).build().perform();
		}
	}

}