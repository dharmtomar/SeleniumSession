package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {

	//... varargs --spread parameter(JS) -- array
	
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		//driver.findElement(By.id("justAnInputBox")).click();
		By searchField=By.id("justAnInputBox");
		By options=By.xpath("//span[@class='comboTreeItemTitle']");
		
		//single selection
		//selectSingleElement(searchField, options, "choice 2");
		//selectMultipleElements(searchField, options, "choice 1","choice 3","choice 6 1");
		selectAllElements(searchField, options, "all");
		
	}

	public static void selectSingleElement(By searchField,By options,String value) {
		driver.findElement(searchField).click();
		List<WebElement> optionlist= driver.findElements(options);
		for(WebElement e:optionlist) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
			}
		}
	}
	
	public static void selectMultipleElements(By searchField,By options,String...value) {
		driver.findElement(searchField).click();
		List<WebElement> optionlist= driver.findElements(options);
		for(WebElement e:optionlist) {
			String text=e.getText();
			System.out.println(text);
			for(String s:value) {
			if(text.equals(s)) {
				e.click();
			}
			}
		}
	}
	
	public static void selectAllElements(By searchField,By options,String... value) {
		driver.findElement(searchField).click();
		List<WebElement> optionlist= driver.findElements(options);
//		if(!value[0].equals("all")) {
//			for(WebElement e:optionlist) {
//				String text=e.getText();
//				System.out.println(text);
//				if(text.equals(value)) {
//					e.click();
//				}
//			}	
//		}
//		else{
			for(WebElement e:optionlist) {
				try {
					e.click();
				}
				catch(ElementNotInteractableException ex){
					break;
				}
			}
		//}
		
	}
	
}
