package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter22ShadowDOMConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//h2[text()='Subscribe to our youtube channel']")).getText());
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//h2[text()='Subscribe to our youtube channel']"))).perform();
		
		String jsPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement pizza= (WebElement)js.executeScript(jsPath);
		pizza.sendKeys("vaibhav");
		
		
	}

}
