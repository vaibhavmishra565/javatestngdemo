package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextTest {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By header = By.tagName("h2");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forgotPassword = By.linkText("Forgotten Password");
		By footer = By.tagName("h5");

//		
//		ElementUtilClass elutil = new ElementUtilClass(driver);
//		String m1=elutil.doGetText(header);
//		String m2=elutil.doGetText(para);
//		String m3=elutil.doGetText(forgotPassword);
//		String m4=elutil.doGetText(footer);
//		
//		System.out.println(m1);
//		System.out.println(m2);
//		System.out.println(m3);
//		System.out.println(m4);
		
		getText(footer);
		getText(para);
		
		
		
	}

	public static String getText(By locator) {
		
		String Text = getElement(locator).getText();
		System.out.println(Text);
		return Text ;
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
