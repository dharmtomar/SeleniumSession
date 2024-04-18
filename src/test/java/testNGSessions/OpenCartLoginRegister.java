package testNGSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLayer.BaseTest;

public class OpenCartLoginRegister extends BaseTest {
//static WebDriver  driver;
	//@BeforeTest
//	public void setup() {
//		driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
	
	@Test
	public void verifyLogoImage() {
		Boolean titleimg=driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertTrue(titleimg,"title img not found");
	}
	@Test
	public void loginButtonPresent() {
		Boolean loginbutton=driver.findElement(By.linkText("Login")).isDisplayed();
		Assert.assertTrue(loginbutton, "login button not present");
	}
	@Test
	public void getTitle() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void getURL() {
		String url= driver.getCurrentUrl();
		System.out.println(url);
	}
	//@Test
	public void getAllLinks() {
	List<WebElement> linkofList=	driver.findElements(By.tagName("a"));
	for(WebElement e:linkofList) {
	String text=	e.getText();
	System.out.println(text);
	
	}
	}
	
	//@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
