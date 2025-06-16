package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter21BasicFramehandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
//		driver.switchTo().frame(2);  By index 
//		driver.switchTo().frame("main"); // it is by the name or ID 
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='main']")));
		
		
		WebElement title = driver.findElement(By.tagName("h2"));
		System.out.println(title.getText());
		
//		frame-one748593425
		
		
		
	}

}
