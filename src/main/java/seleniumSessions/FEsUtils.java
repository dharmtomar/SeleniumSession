package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FEsUtils {
	public static WebDriver driver;
	
	public static void main(String[] args) {

		BrowserUtils br=new BrowserUtils();
		driver=br.launchBrowser("chrome");
		br.openURL("https://www.flipkart.com/");
		
		By links=By.tagName("a");
		By images=By.tagName("img");
		
		System.out.println("Count of total links is- "+getElementsCount(links));
		System.out.println("Count of total images is- "+getElementsCount(images));
		
		ArrayList<String> elList= getElementsTextList(links);
		System.out.println(elList);
		System.out.println("--------------------");
		ArrayList<String> attList= getElementsAttributeList(links, "href");
		System.out.println(attList);
		System.out.println("----------------");
		ArrayList<String> altList= getElementsAttributeList(images, "alt");
		System.out.println(altList);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	public static ArrayList<String> getElementsTextList(By locator) {
			List<WebElement> eleList= getElements(locator);
			ArrayList<String> elem=new ArrayList<String>();
			
			for(WebElement e:eleList) {
				String text= e.getText();
				if(text.length()!=0) {
					elem.add(text);		
				}
			}
			return elem;
	}
	
	public static ArrayList<String> getElementsAttributeList(By locator,String attName) {
		List<WebElement> eleList= getElements(locator);
		ArrayList<String> elemAttrvalue=new ArrayList<String>();
		
		for(WebElement e:eleList) {
			String text= e.getAttribute(attName);
			if(text.length()!=0) {
				elemAttrvalue.add(text);		
			}
		}
		return elemAttrvalue;
}
}
