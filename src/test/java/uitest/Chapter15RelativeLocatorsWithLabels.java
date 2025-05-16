package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class Chapter15RelativeLocatorsWithLabels {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebElement emaillabel = driver.findElement(By.xpath("//label[text() ='E-Mail Address']"));
//		WebElement pwdlabel = driver.findElement(By.xpath("//label[text() ='Password']"));
//		driver.findElement(with(By.id("input-email")).above(pwdlabel).below(emaillabel)).sendKeys("Vaibhav@123");
		
		WebElement agree = driver.findElement(By.xpath("//input[@name ='agree']"));
		WebElement privacyPolicy = driver.findElement(with(By.tagName("a")).toLeftOf(agree));
		System.out.println(privacyPolicy.getText());
		
		if (privacyPolicy.getText().equalsIgnoreCase("Privacy Policy")) {
			System.out.println("the text is present");
		}
		else {
			System.out.println("test case is failed");
		}
		
		WebElement firstName = driver.findElement(By.cssSelector("label[for='input-firstname']"));
		WebElement lastName = driver.findElement(By.cssSelector("label[for='input-lastname']"));
		WebElement email = driver.findElement(By.cssSelector("label[for='input-email']"));
		WebElement telephone = driver.findElement(By.cssSelector("label[for='input-telephone']"));
		WebElement password = driver.findElement(By.cssSelector("label[for='input-password']"));
		WebElement confirm = driver.findElement(By.cssSelector("label[for='input-confirm']"));
		WebElement agreeButton = driver.findElement(By.cssSelector("input[name ='agree']"));
		WebElement policy = driver.findElement(By.cssSelector("a[href=\"https://naveenautomationlabs.com/opencart/index.php?route=information/information/agree&information_id=3\" ]"));
		
		
		driver.findElement(with(By.tagName("input")).toRightOf(firstName)).sendKeys("Vaibhav");
		driver.findElement(with(By.tagName("input")).toRightOf(lastName)).sendKeys("mishra");
		driver.findElement(with(By.tagName("input")).toRightOf(email)).sendKeys("vai@123");
		driver.findElement(with(By.tagName("input")).toRightOf(telephone)).sendKeys("1234567890");
		driver.findElement(with(By.tagName("input")).toRightOf(password)).sendKeys("asd");
		driver.findElement(with(By.tagName("input")).toRightOf(confirm)).sendKeys("asd");
		driver.findElement(with(By.tagName("input")).toRightOf(policy)).click();
		
		driver.findElement(with(By.tagName("input")).toRightOf(agreeButton)).click();
		
//		driver.findElement(with(By.id("input-email")).below(label)).sendKeys("Vaibhav@123");
//		WebElement agreeButton = driver.findElement(By.cssSelector("input[name ='agree']"));
		

	}

}
