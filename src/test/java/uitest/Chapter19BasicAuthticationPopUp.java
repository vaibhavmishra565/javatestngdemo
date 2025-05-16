package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter19BasicAuthticationPopUp {

	public static void main(String[] args) {
//		Those popup which comes in  the starting when page just start 
//		these popup are not JS popup
		WebDriver driver = new ChromeDriver();
		String username = "admin";
		String password ="admin";
		
		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");

	}

}
