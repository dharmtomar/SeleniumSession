package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSuggessionSearch {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			BrowserUtils br=new BrowserUtils();
			driver=br.launchBrowser("chrome");
			br.openURL("https://www.google.com");
			
			By gSearch=By.name("q");
			By searchOptions=By.xpath("//ul[@class='G43f7e']//div/span");
			
			//doSearch(gSearch, searchOptions, "automation","tools");
			ElementUtils eu=new ElementUtils(driver);
			eu.doSearch(gSearch, searchOptions, "automation","tools");
			
	}
//		public static void doSearch(By searchLocator,By searchOptions,String searchKey,String value) throws InterruptedException {
//			driver.findElement(searchLocator).sendKeys(searchKey);
//			Thread.sleep(2000);
//			List<WebElement> suggestions= driver.findElements(searchOptions);
//			for(WebElement e:suggestions) {
//				String text= e.getText();
//				System.out.println(text);
//				if(text.contains(value)) {
//					e.click();
//					break;
//				}
//			}
//		}

}
