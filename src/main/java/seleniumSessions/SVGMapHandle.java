package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGMapHandle {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		Actions act=new Actions(driver);
		List<WebElement> mapstates= driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='region']"));
		System.out.println(mapstates.size());
		for(WebElement e:mapstates) {
		String name=e.getAttribute("id");
		act.moveToElement(e).perform();
		Thread.sleep(500);
		System.out.println(name);
		}
		
	}

}
