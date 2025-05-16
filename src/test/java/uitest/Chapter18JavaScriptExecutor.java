package uitest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter18JavaScriptExecutor {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(5000);
		
		// how things works 
		// java >> JS code >> JavaScript executor code >> Execute Java Script
		
////		now the interface casting 
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title =js.executeScript("return document.title").toString();
//		System.out.println(title);
//		String url = js.executeScript("return document.URL").toString();
//		System.out.println(url);
//		js.executeScript(getTitle(), args)
		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		String tit = jsutil.getTitle();
		System.out.println(tit);
//		jsutil.generateAlert("hi iam vaibhav");
//		String text= jsutil.getPageInnerText();
//		System.out.println(text);// use case of getting whole text 
//		if(text.contains("Order History")) {
//			System.out.println("pass");
//		}
		jsutil.goForwardWithJS();
		System.out.println(tit);
		jsutil.goBackwardWithJS();
		System.out.println(tit);
		jsutil.refreshWithJS();
		System.out.println(tit);
		
		
	}
	public static String getTitle () {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title =js.executeScript("return document.title").toString();
		System.out.println(title);
		return title;
		
	}
	public static String getUrl() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String url =js.executeScript("return document.URL").toString();
		System.out.println(url);
		return url;
	}

}
// This is a concept in Java called typecasting (specifically, interface casting), where you are telling
//Java to treat one object as another type—in this case, you're telling it:

//“Hey Java, treat my driver (which is of type WebDriver) as a JavascriptExecutor.”

/*
 * In Selenium, JavascriptExecutor is an interface that allows you to execute JavaScript code within the context of the web page currently loaded in 
 * the browser. However, not all WebDriver instances directly support JavaScript execution.

Most commonly used WebDriver implementations like ChromeDriver, FirefoxDriver, etc., 
do implement the JavascriptExecutor interface, but to access its methods (like executeScript()), 
you must explicitly cast the WebDriver instance (driver) to JavascriptExecutor.

This line does exactly that — it tells Java to treat the driver object (which is a WebDriver) as
 a JavascriptExecutor. Once casted, you can use JavaScriptExecutor methods with the js object.
 * */
