package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		WebElement multioptions=driver.findElement(By.xpath("//select[@multiple]"));
		Select select=new Select(multioptions);
		System.out.println(select.isMultiple());//isMultiple can be used only with select class
		
		if(select.isMultiple()) {
			select.selectByVisibleText("Andean flamingo");
			select.selectByVisibleText("Greater flamingo");
			select.selectByVisibleText("James's flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.deselectByVisibleText("Andean flamingo");
		}
		
	}
//	public void doMultiSelect(By locator,String visibletext) {
//		driver.findElement(locator)
//	}

}
