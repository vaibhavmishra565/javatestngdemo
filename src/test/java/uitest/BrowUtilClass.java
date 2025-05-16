package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowUtilClass {

    WebDriver driver = new ChromeDriver();

    
  

    public WebDriver launchURL(String url) {
        driver.get(url);
        return driver;
    }
}
