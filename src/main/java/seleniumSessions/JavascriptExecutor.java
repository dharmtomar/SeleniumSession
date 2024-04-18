package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavaScriptUtil ju=new JavaScriptUtil(driver);
//		String title=ju.getTitleByJS();
//		System.out.println("title by JS is : "+title);
//
//		String url=ju.getURLByJS();
//		System.out.println("URL by JS is : "+url);
//		
//		ju.scrollDown();
//		ju.scrollUp();
//		ju.scrollHalfPage();
		//driver.close();
		
		//WebElement el=driver.findElement(By.xpath("//div[@class='list-group']"));
		//ju.drowBorder(el);
		//ju.flash(el);
	}

}
