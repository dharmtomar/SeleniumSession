package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElementlevel2 {
public static WebDriver driver;
	public static void main(String[] args) {
		//http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html
		//http://swisnl.github.io/jQuery-contextMenu/demo.html
		driver=new ChromeDriver();
		driver.get("http://mrbool.com/");
		
		By content=By.xpath("//a[contains(text(),'Content')]");
		By svideos=By.xpath("//a[contains(text(),'Single Videos')]");
		
		handleMoveToElementLavel2(content);
		getElement(svideos).click();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void handleMoveToElementLavel2(By locator) {
		Actions action=new Actions(driver);
		action.moveToElement(getElement(locator)).perform();
		
	}

}
