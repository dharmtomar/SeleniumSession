package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElementLavel4 {
//mouse hover using actions class
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By menuLavel1=By.xpath("(//span[text()='Category'])[2]");
//		By menuLavel2=By.xpath("(//a[contains(text(),'Foodgrains, Oil & Masala')])[2]");
//		By menuLavel3=By.xpath("(//a[contains(text(),'Dry Fruits')])[1]");
//		By menuLavel4=By.xpath("//a[contains(text(),'Cashews')]");
		
		By menuLavel2=By.linkText("Foodgrains, Oil & Masala");
		By menuLavel3=By.linkText("Dry Fruits");
		By menuLavel4=By.linkText("Cashews");
		
		handleMoveToElementLavel4(menuLavel1, menuLavel2, menuLavel3, menuLavel4);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void handleMoveToElementLavel4(By MenuLavel1,By MenuLavel2,By MenuLavel3,By MenuLavel4) throws InterruptedException {
		getElement(MenuLavel1).click();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(getElement(MenuLavel2)).perform();
		Thread.sleep(2000);
		action.moveToElement(getElement(MenuLavel3)).perform();
		Thread.sleep(2000);
		action.click(getElement(MenuLavel4)).perform();
		
		
	}

}
