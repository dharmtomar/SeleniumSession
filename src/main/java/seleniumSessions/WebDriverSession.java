package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		
		//driver.close();
		//SID will be invalid
		
		//WebDriver driver1 = new ChromeDriver();
		//driver1.get("https://google.com/");
		//System.out.println(driver1.getTitle());
		//driver1.quit();
		//SID will be null
		
	}

}
