package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoading {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		boolean flag=isPageLoaded(20);
		if(!flag) {
			throw new BrowserException("PAGE IS NOT LOADED");
		}
	}

	public static boolean isPageLoaded(int timeout) {
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
		String flag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'")).toString();
		
		return Boolean.parseBoolean(flag);
	}
}
