package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetImages {

	public static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtils br=new BrowserUtils();
		driver=br.launchBrowser("chrome");
		br.openURL("https://www.flipkart.com/");
		
		By images=By.tagName("img");
		
		getAllImages(images);
	}

	public static void getAllImages(By locator) {
	List<WebElement> imgList= driver.findElements(locator);
	System.out.println(imgList.size());
	for(WebElement e:imgList) {
		String altvalue=e.getAttribute("alt");
		String srcvalue=e.getAttribute("src");
		System.out.println(altvalue+"---------"+srcvalue);
	}
	
	}
}
