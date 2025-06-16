package uitest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter22ShadowDOM2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/shadowdom");
		Thread.sleep(3000);
		String jspath="return document.querySelector(\"#content > my-paragraph:nth-child(4) > span\")";
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement text= (WebElement) js.executeScript(jspath);
		System.out.println(text.getText());
	}

}
