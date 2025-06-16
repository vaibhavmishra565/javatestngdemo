package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter22MorecomplexSVGelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//div//iframe[contains(id , map-instance-65599)]")));
		String svgPath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g']//*[name()='g'and @class='region']//*[name()='path']";
		List<WebElement> stateList = driver.findElements(By.xpath(svgPath));
		System.out.println(stateList.size());
		Actions act = new Actions(driver);
				
		for(WebElement e :stateList) {
			act.moveToElement(e).perform();
			String name = e.getAttribute("name");
			System.out.println(name);
			Thread.sleep(1000);
			
		}
		
	}

}



