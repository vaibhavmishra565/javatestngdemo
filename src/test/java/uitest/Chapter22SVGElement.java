package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter22SVGElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("macbook pro");
		driver.findElement(By.xpath("//button/*[local-name()='svg' and @fill='none' ]//button/*[local-name()='svg' and @fill='none' ]")).click();
		
	}
}
