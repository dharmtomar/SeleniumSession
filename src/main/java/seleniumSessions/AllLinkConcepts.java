package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllLinkConcepts {
	public static void main(String[] args) {
		WebDriver driver=null;

		BrowserUtils br=new BrowserUtils();
		driver=br.launchBrowser("chrome");
		br.openURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
//		for(int i=0;i<links.size();i++) {
//			String linktext=links.get(i).getText();
//			if(linktext.length()!=0) {
//			System.out.println(linktext);
//			}
//		}
		//foreach loop
//		for(WebElement e:links) {
//			String text=e.getText();
//			if(text.length()!=0) {
//				System.out.println(text);
//				}
//		}
		System.out.println("----------------------");
		
		List<WebElement> list= driver.findElements(By.className("form-control"));
		System.out.println(list.size());
	}

}
