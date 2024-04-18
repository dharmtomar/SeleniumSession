package seleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectorsHub {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[contains(@id,'shub')]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[contains(@name,'company')]")).sendKeys("vfirst");
		driver.findElement(By.xpath("//input[contains(@name,'mobile number')]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.findElement(By.id("inp_val")).sendKeys("you are my first crush");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//label//*[local-name()='svg']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='First Enter name']")).sendKeys("thakur");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('test')[1].value='tomarg'");
		
		Actions act=new Actions(driver);
		WebElement checkout=driver.findElement(By.xpath("//button[text()='Checkout here']"));
		act.moveToElement(checkout).perform();
		
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='dropdown-content']"));
		for(WebElement e:list) {
			String text=e.getText();
			System.out.println(text);
		}
		//car dropdown
		WebElement car= driver.findElement(By.id("cars"));
		Select select=new Select(car);
		List<WebElement> carlist=driver.findElements(By.xpath("//select[@id='cars']/option"));
		//select.selectByVisibleText("Opel");
		for(WebElement e:carlist) {
			String text=e.getText();
			System.out.println(text);
			if(text.contains("Saab")) {
				e.click();
				break;
			}
		}
		
		js.executeScript("document.getElementById('datepicker').value='01/01/1947'");
		
		//String username="Jasmine.Morgan";
		//selectUser(username);
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		String user11="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")";
		WebElement  el11= (WebElement) js.executeScript(user11);
		el11.sendKeys("shadow11");
		String pizza_name="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		WebElement pizza=(WebElement)js.executeScript(pizza_name);
		pizza.sendKeys("full_capsicum");
		
		//String concept_test="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#concepts\")";
		//WebElement con_test=(WebElement)js.executeAsyncScript(concept_test);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement ell= wait.until(ExpectedConditions.visibilityOfElementLocated((By) con_test));
		//con_test.sendKeys("new concept");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='myFile']")).click();
		driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("D:\\New folder\\Documents\\Resume\\NewTextDocument.txt");
		driver.findElement(By.xpath("//button[text()='Click To Open Window Alert']")).click();
		Alert alert= driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
	}

	public static void selectUser(String username) {
		String selectuser_xpath="//a[text()='"+username+"']/parent::td/preceding-sibling::td";
		//driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td")).click();
		driver.findElement(By.xpath(selectuser_xpath)).click();
	}
}
