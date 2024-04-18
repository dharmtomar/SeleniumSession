package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
//		driver.manage().window().fullscreen();
//		driver.manage().window().minimize();
//		Dimension dim=new Dimension(600, 900);
//		driver.manage().window().setSize(dim);
		//responsive-  view port
		
		WebElement el= driver.findElement(By.id("input-firstname"));
		
		int ht= el.getSize().height;
		int wd=el.getSize().width;
		System.out.println(ht+"  "+wd);

		int xp= el.getLocation().getX();
		int yp=el.getLocation().getY();
		System.out.println(xp+"  "+yp);
		
		String bgcl=el.getCssValue("background-color");
		System.out.println(bgcl);
		

	}

}
