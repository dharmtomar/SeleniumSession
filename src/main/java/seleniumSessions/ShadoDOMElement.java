package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadoDOMElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
//		driver.get("chrome://settings/");
//		//driver.findElement(By.id("searchInput")).sendKeys("notifications");
//		String search_field="return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement el= (WebElement) js.executeScript(search_field);
//		el.sendKeys("AI");
		
		//shadoDOM- with frames-
		//sc1: B --> P --> shadowDOM(open) -- element
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		//String search_field="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")";
//		String search_field="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement el= (WebElement) js.executeScript(search_field);
//		el.sendKeys("dharm");
		
		//sc2:    -- //Browser -- page --> shadow DOM(open) ---> iframe --- element
		String frame_script="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement frame1= (WebElement)js.executeScript(frame_script);
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@id='glaf']")).sendKeys("hello");
		
	}

}
