package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzWebTable {
public static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scores/88949/sl-vs-ban-3rd-odi-sri-lanka-tour-of-bangladesh-2024");
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		
		String batsman="Janith Liyanage";
		getBatsmanRun(batsman);
		//System.out.println("Run scored by "+batsman+" are "+runs);
	}
	
	public static void getBatsmanRun(String batsmanName) {
		List<WebElement> runs=driver.findElements(By.xpath("//a[contains(text(),'"+batsmanName+"')]/parent::div/following-sibling::div"));
		
		for(WebElement e:runs) {
			System.out.println(e.getText());
		}
			
	}

}
