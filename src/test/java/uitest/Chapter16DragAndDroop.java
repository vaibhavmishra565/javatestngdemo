package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Chapter16DragAndDroop {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		By sourceElement = By.id("draggable");
		By targetElement = By.id("droppable");
		By header = By.xpath("//h1[text()='Droppable']");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		Actions act = new Actions(driver);
		
		// a1 .a2 .a3 >> build will arrangeb the methods in row , perfom will perform the actions in the same sequence 
		Action dragNDrop= // action is a interface 
		act.clickAndHold(driver.findElement(sourceElement))
				.moveToElement(driver.findElement(targetElement))
					.release().build();
		// if you use like this 
		// build() >> will not work 
		// perform >> will work
		// build and perform >> will work
		// build method gives or return Action
		//this action can be resued 
		
		
		
		dragNDrop.perform();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		System.out.println(driver.findElement(header).getText());
		
//		Actions >> Class > used to achive the builder action using method chaining to perform various actions by methods 
//		Action >> interface >> build will perform action (Single or composite) >> which can be uesd further to perform 
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")))	;
//		driver
		
		act.dragAndDrop(driver.findElement(sourceElement), driver.findElement(targetElement));
		

	}

}
