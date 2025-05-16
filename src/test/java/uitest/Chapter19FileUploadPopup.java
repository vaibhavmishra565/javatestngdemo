package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter19FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
//		for file upload the typ=file should be there and is mandatory 
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		chooseFile.sendKeys("C:\\Users\\Vaibhav Mishra\\Downloads\\st0522_vms14stu02_vms14job_14_05_2025_16_49_44.pdf");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
//		 Random popup cant be handeled using the driver as the popup will suddenly emerge , and cant predict the timing 
//		
	}

}
