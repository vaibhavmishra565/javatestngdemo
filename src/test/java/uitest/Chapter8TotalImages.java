package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter8TotalImages {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

//		List<WebElement> imgList = driver.findElements(By.tagName("img"));
//		int imagecount = imgList.size();
//		System.out.println(imagecount);
//
//		for (WebElement e : imgList) {
//			String srcValue = e.getAttribute("src"); // it is used for getting any attribute value
//			if(srcValue!=null) {
//			System.out.println(srcValue);
//			}
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Total Links present on tthe page are :"+ links);
		
		for(WebElement e :links) {
			String text =e.getText();
			String hrfValue=e.getAttribute("href");
			System.out.println("Text is "+text +"And the Href Value is"+hrfValue);
			
		}
		
		
		}

	}


