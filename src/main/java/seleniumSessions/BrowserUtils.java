package seleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author dharm
 */
public class BrowserUtils {

	WebDriver driver;

	/**
	 * 
	 * @param BrowserName
	 * @return this return driver
	 */
	public WebDriver launchBrowser(String BrowserName) {
		switch (BrowserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please enter correct browser-" + BrowserName);
			throw new BrowserException("Browser Not Found");
		}
		return driver;
	}

	public void openURL(String url) {

		if (url == null) {
			throw new BrowserException("URL is null");
		}
		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			throw new BrowserException("HTTP/S is missing in url please passs correct one");
		}
	}

	public void openURL(URL url) {
		if (url == null) {
			throw new BrowserException("URL is null");
		}
		String appURL = String.valueOf(url);
		if (appURL.indexOf("http")==0) {
			driver.navigate().to(url);
		} else {
			System.out.println("Non-HTTP/S url please passs correct one");
		}
	}

	public String gettitle() {
		return driver.getTitle();
	}

	public String getcurrentURL() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
