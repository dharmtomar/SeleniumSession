package baseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
public WebDriver driver;
@Parameters({"browser","url","headless"})
	@BeforeTest
	public void setup(String browser,String url,String headless) {
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			ChromeOptions co=new ChromeOptions();
			if(Boolean.parseBoolean(headless)) 
			{
			co.addArguments("--headless");
			}
			driver=new ChromeDriver(co);
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("browsername is not correct please pass correct browser " +browser);
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@AfterTest
	public void taerdown() {
		driver.quit();
	}
}
