package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppTest {
	//public static WebDriver driver;
	public static void main(String[] args)  {
		{

			
			BrowserUtils br=new BrowserUtils();
			WebDriver driver=br.launchBrowser("chrome");
			br.openURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			System.out.println(br.gettitle());
			
			By fname=By.id("input-firstname");
			By lname=By.id("input-lastname");
			
			
			ElementUtils el=new ElementUtils(driver);
			el.doSendKeys(fname, "dharm");
			el.doSendKeys(lname, "tomar");
		}
	} 

}
