package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//implicit wait
		//1- its global wait that applied to all web elements
		//2- if we want to update wait for any page/element then we need to override it again and again
		//3- IW can't be used for a specific web element 
		//4- we can't apply IW for non web elements i.e- JS alert,titles,urls,browser windows
		//5- we should avoid to use implicit wait in framework as it work as global wait.
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("dharm");
		driver.findElement(By.id("input-lastname")).sendKeys("tomar");
		
	}

}
