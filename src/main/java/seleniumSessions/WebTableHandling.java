package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
static WebDriver driver;
	public static void main(String[] args) {

		// *[@id="customers"]/tbody/tr[2]/td[1]/span
		// *[@id="customers"]/tbody/tr[3]/td[1]/span

		//*[@id="main"]/div[5]/table/tbody/tr[2]/td[2]
		
		//*[@id="main"]/div[5]/table/tbody/tr[2]/td[1]/text()
		//*[@id="main"]/div[5]/table/tbody/tr[3]/td[1]
		
		// a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		// a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']

		driver = new ChromeDriver();
		//driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
//		selectUser("Joe.Root");
//		selectUser("Kevin.Mathews");
//		selectUser("John.Smith");
//		selectUser("Jordan.Mathews");
		
//		getUserDetails("Jordan.Mathews");
//		System.out.println("-------------");
//		getUserDetails("Joe.Root");
		
		//getW3cTableDetails();
		getCustomerData(7);
		
	}
	public static void selectUser(String userName) {
		String xpath = "//a[text()='"+userName+"']/ancestor::tr//input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}
	public static void getUserDetails(String userName) {
		String xpath="//a[text()='"+userName+"']/parent::td//following-sibling::td";
		List<WebElement> ellist=driver.findElements(By.xpath(xpath));
		for(WebElement e:ellist) {
			String text=e.getText();
			System.out.println(text);
		}
	}
	
	public static void getW3cTableDetails() {
		String beforeXpath="//*[@id='main']/div[5]/table/tbody/tr[";
		String afterxpath="]/td";
		for(int i=3;i<=7;i++) {
			String finalxpath=beforeXpath+i+afterxpath;
			List<WebElement> fl= driver.findElements(By.xpath(finalxpath));
			for(WebElement e:fl) {
				System.out.println(e.getText());			}
		}
	}
	public static void getCustomerData(int colno) {
		String xpath="//*[@id='main']/div[5]/table/tbody/tr/td["+colno+"]";
		List<WebElement> cd=driver.findElements(By.xpath(xpath));

		for(WebElement e:cd) {
			String text=e.getText();
			System.out.println(text);
		}
	}

}
