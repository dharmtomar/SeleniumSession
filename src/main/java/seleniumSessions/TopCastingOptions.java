package seleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1- CD dr=new CD();
		//valid --when app support chrome only
		//ChromeDriver driver=new ChromeDriver();
		
		//2- ChromiumDriver dr=new ChromiumDriver();
		//valid but can't use safari or firefox methods
		//ChromiumDriver driver=new ChromeDriver();
		
		//3- RWD dr=new CD();
		//valid but if new browser want to override some other methods then WD reference would be better
		//RemoteWebDriver driver=new ChromeDriver();
		
		//4- WD dr=new CD();
		//valid -recommended
		
		//WebDriver driver=new ChromeDriver();
		
		//5- SC dr=new searchcontext();
		//valid but not recommended because webdriver methods are not accessible
		//SearchContext driver=new ChromeDriver();
		
		//6- WD dr=new RWD();
		//valid --recommended --used when execute TC on remote machine using grid
		//WebDriver driver=new RemoteWebDriver("remoteserverURL", "capabilities-browser details")
		
		
		
		
	}

}
