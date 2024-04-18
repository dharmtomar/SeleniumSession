package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForURL {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/88949/ban-vs-sl-3rd-odi-sri-lanka-tour-of-bangladesh-2024");
		String urlFraction="www.cricbuzz.com1";
		String urlfull="https://www.cricbuzz.com/live-cricket-scorecard/88949/ban-vs-sl-3rd-odi-sri-lanka-tour-of-bangladesh-2023";

		String url=waitForURLContains(urlFraction, 5);
		System.out.println(url);
		
		//String url=waitForURLToBe(urlfull, 5);
		//System.out.println(url);
	}

	public static String waitForURLContains(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("url not found within- " + timeout);
		}
		return null;
	}

	public static String waitForURLToBe(String urlfull, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlToBe(urlfull))) {
				return driver.getCurrentUrl();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("url not found within- " + timeout);
		}
		return null;
	}

}
