package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class AdjacentSiblingTest {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
	        
	        // Open test webpage
	        driver.get("https://www.saucedemo.com/inventory.html"); // Replace with your actual URL
	        
	        // Locate the first paragraph (`p`) that comes right after a `div` using CSS Selector
	        WebElement adjacentParagraph = driver.findElement(By.cssSelector("div + p"));
	        
	        // Print the text of the selected paragraph
	        System.out.println("Adjacent Paragraph Text: " + adjacentParagraph.getText());
	        
	        // Perform any required action on the found element (e.g., click, send keys)
	        // adjacentParagraph.click();
	        
	        // Close the browser
	        driver.quit();
	    }

	}


