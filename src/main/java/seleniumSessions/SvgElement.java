package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElement {

	public static void main(String[] args) {

		//button//*[local-name()='svg']
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("mackbook");
		driver.findElement(By.xpath("//button//*[local-name()='svg']")).click();
	}

}
