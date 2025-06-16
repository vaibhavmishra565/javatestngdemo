package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter25WaitForFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		By frameLocator = By.xpath("//frame[@name='frame-middle']");
		ElementUtilClass elUtil = new ElementUtilClass(driver);
		elUtil.waitForFrameUsingLocatorAndSwitchToIt(frameLocator, 10);
		String FrameText = driver.findElement(By.xpath("//div[@id='content'}")).getText();
		System.out.println(FrameText);

	}

}
