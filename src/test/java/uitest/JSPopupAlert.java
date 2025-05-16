package uitest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopupAlert {

	public static void main(String[] args) throws InterruptedException {
//		There are three types of alert in js which are JS popup 
//		1.alert popup > which gives oonly alert messgae 
//		2.confirm popup >> which has yes or no messgae 
//		3.Propmpt popup >> It gives the user to submit some value 
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alert =driver.switchTo().alert();
//		// alert is the Interface
//		Thread.sleep(3000);
//		System.out.println(alert.getText());
////		alert.accept();
//		alert.dismiss();
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert =driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("vaibhav mishra");
		alert.accept();
		
//		there cant be multiple popup on one screen , there can only be one js  popup on the screen
//		No alert presesnt exception when there is no popup 
//		in prompt there will be only one text field 
		
		
		
	}

}
