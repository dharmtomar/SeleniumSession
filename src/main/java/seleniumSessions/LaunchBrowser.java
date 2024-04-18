package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//launch browser
		//open the url
		//verify the title
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		if(title.equals("Facebook – log in or sign up")) {
			System.out.println("correct title : TC- Passed-->" +title);
		}
		else {
			System.out.println("Title not matched : TC Failed-->"+title);
		}
		//driver.close();// org.openqa.selenium.NoSuchSessionException: invalid session id
		driver.quit();// org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		System.out.println(driver.getTitle());
	}

}
