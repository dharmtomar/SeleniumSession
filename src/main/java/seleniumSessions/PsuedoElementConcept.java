package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementConcept {

	public static void main(String[] args) {

		String script = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('content');";
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String text= js.executeScript(script).toString();
		System.out.println(text);
		
		if(text.contains("*")) {
			System.out.println("this field is mandate");
		}
	}

}
