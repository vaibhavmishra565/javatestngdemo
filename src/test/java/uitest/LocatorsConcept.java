package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsConcept {

	public static void main(String[] args) {

		BrowUtilClass brutil = new BrowUtilClass();

		WebDriver driver = brutil
				.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		Locators are for the location of elements 
//		The formula for doin any thing in the selenium is Create web element and perform action 

//		1.  By id >> which is always unique , .id are the methods in by class
//		driver.findElement(By.id("input-firstname")).sendKeys("Vaibhav");
//		driver.findElement(By.id("input-lastname")).sendKeys("Automation");

//		2. By Name >>Name is also a attribute but is not unique 
//		driver.findElement(By.name("firstname")).sendKeys("Vaibhav name");

//		3. By Class Name : Is also a attrubte but is always duplicate 

//		driver.findElement(By.className("form-control")).sendKeys("Vaibhav");// thsi wi;l go the first element it finds

//		4. By Xpath >> Xpath is not a attribute but it is address in DOM 
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Vaibhav");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Automation");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();

//		5.By CSS >> CSS is not a attribute 
		// CSS stands for Cascaded Style Sheet , It adds couring look and feel of the
		// HTML
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("vaibhav");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();

//		6. By Link Text >> Is used only for links , can be duplicate 
//		Can be used only for the <a> tag

//		driver.findElement(By.linkText("Forgotten Password")).click();

//		7. By Partial Link Text >> Is only for Links, Can be duplicate
//		use only partial text 
//		driver.findElement(By.partialLinkText("Password")).click();

//		8. By Tag name 
//		String header =driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
//		if (header.equals("Register Account")) {
//			System.out.println("Pass");
//		}
//		else {
//			System.out.println("Fail");
//		}

		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.name("email");
		By Telephone = By.name("telephone");
		By password = By.xpath("//*[@id=\"input-password\"]");
		By confirmPassword = By.cssSelector("#input-confirm");
		By agree = By.name("agree");
		By forgotPassword = By.linkText("Forgotten Password");
		By tagnameTest = By.tagName("h1");

		ElementUtilClass elutil = new ElementUtilClass(driver); /// ??????????
		elutil.dosendkeys(firstname, "italvi");
		elutil.dosendkeys(lastname, "Tiwari");
		elutil.dosendkeys(email, "it@gmail.com");
		elutil.dosendkeys(Telephone, "123456798");
		elutil.dosendkeys(password, "it123");
		elutil.dosendkeys(confirmPassword, "it123");
		elutil.doClick(agree);
		elutil.doClick(forgotPassword);
		elutil.doGetText(tagnameTest);

	}

}
// WebDriver Driver = new ChromeDriver();

//
//
//
//
