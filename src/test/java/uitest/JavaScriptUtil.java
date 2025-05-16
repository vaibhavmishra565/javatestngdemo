package uitest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtil {
	private WebDriver driver;
	private JavascriptExecutor js;

	public JavaScriptUtil(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
	}

	public String getTitle() {
		return js.executeScript("return document.title;").toString();

	}

	public String getUrl() {
		return js.executeScript("return document.URL;").toString();
	}

	public void generateAlert(String msg) {
		js.executeScript("alert('" + msg + "')");
	}

	public String getPageInnerText() {
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	public void goForwardWithJS() {
		js.executeScript("history.go(1)");
	}
	public void goBackwardWithJS() {
		js.executeScript("history.go(-1)");
	}
	public void refreshWithJS() {
		js.executeScript("history.go(0)");
	}

}
