package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		long loadtime=driver.manage().timeouts().getPageLoadTimeout().getSeconds();
		System.out.println(loadtime);
	}

}
