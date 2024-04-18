package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		//co.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(co);
		
//		FirefoxOptions fo=new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver=new FirefoxDriver(fo);
		
		//EdgeOptions eo=new EdgeOptions();
		//eo.addArguments("--headless");
		//eo.addArguments("--inprivate");
		//WebDriver driver=new EdgeDriver(eo);
		
		driver.get("http://www.flipkart.com");
		String title=driver.getTitle();
		if(title.contains("Online Shopping Site")) {
			System.out.println("title--pass: "+title);
		}
		else {
			System.out.println("title--fail");
		}
		String url=driver.getCurrentUrl();
		if(url.contains("flipkart.com")) {
			System.out.println("url--pass: "+url);	
		}
		else {
			System.out.println("url--fail");
		}
	}

}
