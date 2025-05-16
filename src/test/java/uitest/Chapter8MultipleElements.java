package uitest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter8MultipleElements {

	public static void main(String[] args) {
		
//		Find element >> for a single element >> web element
//		find elements >> for multiple elements >> list of web elements 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int totalLinks = linklist.size();
		
		System.out.println("total Links are >> " + totalLinks );
		
		for (int i=0 ; i<totalLinks ; i++) 
		{
			String text = linklist.get(i).getText(); 
			if (text.length()!=0) {
			System.out.println("Link Number =" +i+" "+text);
			}
			System.out.println("------------------");
			int count =0 ; 
			for (WebElement e :linklist) {
				String text1 = e.getText();
				if (text.length()!=0) {
					System.out.println("The List is as "+text1);
					
				}
				count++;
				
			}
		}
		
		
		
		
	}

}
