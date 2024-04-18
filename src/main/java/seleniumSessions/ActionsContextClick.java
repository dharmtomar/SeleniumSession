package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsContextClick {
//double click using actions class
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		List<WebElement> rightlist=driver.findElements(By.cssSelector("ul.context-menu-list>li:not(.context-menu-separator)"));
		
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
		for(WebElement el:rightlist) {
			String text=el.getText();
			//System.out.println(text);
			if(text.equals("Delete")) {
				el.click();
				break;
			}
		}
	}

}
