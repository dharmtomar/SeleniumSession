package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitle {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/88949/ban-vs-sl-3rd-odi-sri-lanka-tour-of-bangladesh-2024");

		String title = "Cricket scorecard - Bangladesh vs Sri Lanka, 3rd ODI, Sri Lanka tour of Bangladesh, 2024 | Cricbuzz.com";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		if(wait.until(ExpectedConditions.titleContains(title))) {
//			System.out.println("title matched");
//		}
		String titleFraction = "Cricket scorecard - Bangladesh vs Sri Lanka, 3rd ODI";
		//String titlef=waitForTitleContains(titleFraction, 5);
		//System.out.println(titlef);
		
		String titlefull=waitForTitleToBe(title, 5);
		System.out.println(titlefull);
	}

	public static String waitForTitleContains(String titleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println("title not found within- "+timeout);
		}
		return null;
	}
	
	public static String waitForTitleToBe(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println("title not found within- "+timeout);
		}
		return null;
	}

}
