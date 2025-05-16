package uitest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter14Practiseagain {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
//		List<WebElement> linkList = driver.findElements(By.xpath("//h5[text()='About Us']/following-sibling::ul//a"));
//		for (WebElement e : linkList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
//		getFooterLinksList("About Us");
		System.out.println(getFooterLinksList("About Us"));
		
	}
	
	public static List<String> getFooterLinksList(String footerTitle) {
		List<WebElement> linksList = driver.findElements(By.xpath("//h5[text()='"+footerTitle+"']/following-sibling::ul//a"));
		List<String> footerLinklist = new ArrayList<String>() ;
		
		for (WebElement e :linksList)
		{
			String text =e.getText();
			footerLinklist.add(text);
						 
		}
		return footerLinklist;
	} 

}
