package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediFrame {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/"); 
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("this is my first crush");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("this is my current crush");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("this is my destiny");
		
		//--------------------------------
		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("jex")).sendKeys(" :) oh no");
//		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys(" -- one two three");
//		
		//System.out.println(driver.findElement(By.xpath("//h3[text()='Dare for you']")).getText());
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		//System.out.println(driver.findElement(By.xpath("//h3[text()='Memory Test']")).getText());
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys(" kkkkkkiran");
		
		// f3- f2 by switchTo.frame()  --> Nooo
		// f3- f2 by switchTo.parentFrame()  --> Yess
		// parent frame to child frame- switchTo.frame()
		// child frame to parent frame- switchTo.parentFrame()
		// frame to page -- switchTo.defaultContnent()
		
		
		
	}

}
