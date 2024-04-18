package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By el = By.cssSelector("div#imageTemplateContainer");
		driver.findElement(el).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				// .ignoring(NoSuchElementException)
				.withMessage("time .. element not visible");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame-one547028434"));

		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("dharm");
	}

}
