package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter13JustApractise {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
//		driver.get("https://selectorshub.com/xpath-practice-page/");
//		driver.findElement(By.xpath("//a[text()='Jasmine.Morgan']/parent::td/following-sibling::td[text()='ESS']")).getText();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> countryDetails = driver.findElements(By.xpath("//strong[text()='Afghanistan']/parent::td/following-sibling::td"));
		for (WebElement e: countryDetails ) {
			String Text = e.getText();
			System.out.println(Text);
		}
	}
	public static void GetCountryDetails() {
		List<WebElement> countryDetails =  driver.findElements(By.xpath("//strong[text()='Afghanistan']/parent::td/following-sibling::td"));
		for (WebElement e :countryDetails) {
			
		}
	} 
}

//		Axes path in nutshell ///////////////////////////////////////////////////////////////
//		parent to direct child >> / (single slash and tag name) 
//		Grand parent to child or indirect child >> //(two double slash and the tag name )>>>>>>>also known as Descendant childs 
//		parent to child also can be /child::tag name (direct child )
//		parent to indirect child //child::tag name
// 		also there are keywords /descendant::tag name , which can be used as //all descendats will come 


//////////////////////////////////////////////////following and preceding concept /////////////////
//  	/following::tag name (used for all the following tags)
//		for example //input[@id='input-email']/ following::input[@id='input-password']
//		/preceding::tag name (this is ueds for all the preceding elements) 
//		for example //input[@id='input-password']/preceding::input[@id='input-email']

/////////////////// use of star //////////////////////////////////
// 		if we have to select from where there is soe attribute 
//		we can use as //*[@id='input-firstname'] will see whole and find id where id is first-name
//		better we should use //input[@id='input-firstname'] will use only those which has input tag and more readable 




//		child to dierct parent >> /parent:: tag name of parenttag name  
//		child to grand parent or ancestor >> / ancestor::tag name 

// 		preceding sibling >> preceding-sibling:: tag name 
// 		following sibling>> following-sibling::yag name 




		

