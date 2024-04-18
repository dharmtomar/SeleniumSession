package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		if(title.equals("Facebook – log in or sign up")) {
			System.out.println("correct title : TC- Passed-->" +title);
		}
		else {
			System.out.println("Title not matched : TC Failed-->"+title);
		}
		
		String currentURL=driver.getCurrentUrl();
		if(currentURL.contains("https://www.facebook.com/")) {
			System.out.println("URL is correct and matched");
		}
		driver.close();
	}

}
