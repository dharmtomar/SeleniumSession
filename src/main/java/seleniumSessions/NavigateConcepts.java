package seleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcepts {

	public static void main(String[] args) throws MalformedURLException {
		//navigate methods- back,forward,to,refresh
		//get vs to-  to method is synonym to get as to is using get method internally
		//both methods work same and both works with back/forward
		//to method is overloaded method but get is not
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		driver.get("https://www.linkedin.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.navigate().to("https://margcompusoft.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to(new URL("https://www.gmail.com"));
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}

}
