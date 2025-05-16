package uitest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter13XpathAxes {
	static WebDriver driver ; 
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
//		XPath locators 
//
//		Normalize-space() function 
//		it is used for omitting space when there is space in text locator
//		for eg 
//		//label[normalize-space()= 'Yes' ]
//		//label[normalize-space() ='No']
//
//
//		parent to child locator 
//
//		Direct child we will use single / 
//		indirect child we will use double //
//
//		for the URL https://app.hubspot.com/login
//
//		//form//input[@id ='username']  // parent is form and indirect child is input 
//		//section//div/input[@id='pass'] for url https://selectorshub.com/xpath-practice-page/
//
//		child to parent 
//
//		we can use both 
//		//input[@name='company']/../../../../../../../../../..     (this is used for direct parent)
//		 or 
//		//input[@name='company']/parent::div  (this is used for direct parent)
//
//		for grand parent or indirect parent 
//
//		// //input[@name='company']/ancestor::div[@class='userform']
		
//		driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
 
//		driver.findElement(By.xpath("//a[text() ='Jordan.Mathews']//ancestor::td//preceding-sibling::td/input[@type=\"checkbox\"]")).click();
//		driver.findElement(By.xpath("//a[text() ='Jordan.Mathews']/parent::td/preceding-sibling::td/input[@type=\"checkbox\"]")).click();
		
		List<WebElement> userdata = driver.findElements(By.xpath("//a[text() ='Joe.Root']/parent::td/following-sibling::td"));
		for(WebElement e : userdata) {
			String text = e.getText();
			System.out.println(text);
			
		}
		
//		String userName = ""
//		
//		
		
	}
	
	public static List<String> getUserDetails(String userName) {
		List<WebElement> userData = driver.findElements(By.xpath("//a[text() ='"+userName+"']/parent::td/following-sibling::td"));
		List<String> userDetailsList  = new ArrayList<String>();
		for (WebElement e : userData) {
			String text = e.getText();
			userDetailsList.add(text);
			
		}
		return userDetailsList;
	}
	
	public static void selectUser (String userName) {
		driver.findElement(By.xpath("//a[text() ='"+userName+"']/parent::td/preceding-sibling::td/input[@type=\"checkbox\"]")).click();
		
	}

}
