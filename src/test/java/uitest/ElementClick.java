package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementClick {

	public static void main(String args[]) throws InterruptedException {	
	BrowUtilClass brutil = new BrowUtilClass();
	WebDriver driver = brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
    System.out.println(driver.getTitle());	
	By firstName = By.id("input-firstname");
	By lastName = By.id("input-lastname");
	By email = By.id("input-email");
	By telephone = By.id("input-telephone");
	By password = By.id("input-password");
	By inputconfirm = By.id("input-confirm");
	By agree = By.name("agree");
	By submit =By.className("btn-primary");
	
	ElementUtilClass elUtil = new ElementUtilClass(driver);
	 elUtil.dosendkeys(firstName, "vaibhav");
	 elUtil.dosendkeys(lastName, "Mishra");
	 elUtil.dosendkeys(email, "vai@gmail.com");
	 elUtil.dosendkeys(telephone, "1223344556");
	 elUtil.dosendkeys(password, "V@123");
	 elUtil.dosendkeys(inputconfirm, "V@123");
	 elUtil.doClick(agree);
	 elUtil.doClick(submit);
	 
	 Thread.sleep(2000);
	 
	 }

	

}
